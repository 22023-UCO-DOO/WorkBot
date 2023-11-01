package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.crosscutting.exception.concrete.DataWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
import co.edu.uco.workbot.data.dao.EjercicioDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.EjercicioEntity;
import co.edu.uco.workbot.data.entity.SerieEntity;

public class EjercicioSQLServerDAO extends SQLDAO implements EjercicioDAO {

	public EjercicioSQLServerDAO(Connection conexion) {
		super(conexion);
	}

	@Override
	public void crear(EjercicioEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("INSERT INTO Ejercicio (id, nombre, descripcion, serie) ");
		sentencia.append("VALUES (?,?,?,?) ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setObject(2, entity.getNombre());
			sentenciaPreparada.setString(3, entity.getDescripcion());
			sentenciaPreparada.setObject(4, entity.getSerie());

			sentenciaPreparada.executeUpdate();

		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000036),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000037));
		} catch (final Exception excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000038),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000039));
		}

	}

	@Override
	public void modificar(EjercicioEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("UPDATE Ejercicio ");
		sentencia.append("SET id=?, nombre=?, descripcion=?, serie=?");
		sentencia.append("WHERE id=? ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setString(2, entity.getNombre());
			sentenciaPreparada.setObject(3, entity.getDescripcion());
			sentenciaPreparada.setObject(4, entity.getSerie());

			sentenciaPreparada.executeUpdate();

		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000040),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000041));
		} catch (final Exception excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000042),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000043));
		}

	}

	@Override
	public void eliminar(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("DELETE FROM Ejercicio ");
		sentencia.append("WHERE id=?");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.executeUpdate();

		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000044),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000045));
		} catch (final Exception excepcion) {
			throw DataWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000046),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000047));
		}

	}

	@Override
	public Optional<EjercicioEntity> consultarPorId(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("SELECT id, nombre, descripcion,serie ");
		sentencia.append("FROM Ejercicio ");
		sentencia.append("WHERE id = ? ");

		Optional<EjercicioEntity> resultado = Optional.empty();
		try (final var sentenciaPrepareda = getConexion().prepareStatement(sentencia.toString())) {
			sentenciaPrepareda.setObject(1, id);

			resultado = ejecutarConsultaPorId(sentenciaPrepareda);
		} catch (final DataWorkBotException excepcion) {
			throw excepcion;
		} catch (final Exception excepcion) {

			throw DataWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000050),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000051));
		}

		return resultado;
	}

	@Override
	public List<EjercicioEntity> consultar(EjercicioEntity entity) {
		final var parametros = new ArrayList<Object>();
		final String sentencia = formarSentenciaConsulta(entity, parametros);

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia)) {

			colocarParametrosConsulta(sentenciaPreparada, parametros);
			return ejecutarConsulta(sentenciaPreparada);

		} catch (DataWorkBotException excepcion) {
			throw excepcion;
		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000053));
		} catch (Exception excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000054));
		}
	}

	private final void colocarParametrosConsulta(final PreparedStatement sentenciaPreparada,
			final List<Object> parametros) {
		try {
			for (int indice = 0; indice < parametros.size(); indice++) {
				sentenciaPreparada.setObject(indice + 1, parametros.get(indice));
			}
		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000055));
		} catch (Exception excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000056));
		}
	}

	private final String formarSentenciaConsulta(final EjercicioEntity entity, final List<Object> parametros) {

		final StringBuilder sentencia = new StringBuilder();
		String operadorCondicional = "WHERE";

		sentencia.append("SELECT id,codigo,nombre, estado ");
		sentencia.append("FROM Ejercicio ");
		if (!UtilObjeto.esNulo(entity)) {
			if (!UtilObjeto.esNulo(entity.getId())) {
				sentencia.append(operadorCondicional).append(" id=? ");
				operadorCondicional = "AND";
				parametros.add(entity.getId());
			}
			if (!UtilTexto.estaVacio(entity.getNombre())) {
				sentencia.append(operadorCondicional).append(" nombre=? ");
				operadorCondicional = "AND ";
				parametros.add(entity.getNombre());
			}

			if (!UtilTexto.estaVacio(entity.getDescripcion())) {
				sentencia.append(operadorCondicional).append(" descripcion=? ");
				operadorCondicional = "AND ";
				parametros.add(entity.getDescripcion());
			}

			if (!UtilObjeto.esNulo(entity.getSerie())) {
				sentencia.append(operadorCondicional).append(" serie=? ");
				operadorCondicional = "AND ";
				parametros.add(entity.getSerie());
			}

		}

		sentencia.append(" ORDER BY nombre ASC ");
		return sentencia.toString();
	}

	private final List<EjercicioEntity> ejecutarConsulta(final PreparedStatement sentenciaPreparada) {
		final var listaResultados = new ArrayList<EjercicioEntity>();

		try (final var resultados = sentenciaPreparada.executeQuery()) {
			while (resultados.next()) {
				var tipoIdentificacionEntity = EjercicioEntity.crear(
						UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),
						resultados.getString("nombre"), resultados.getString("descripcion"),
						resultados.getObject("serie", SerieEntity.class));
				listaResultados.add(tipoIdentificacionEntity);
			}
		} catch (final SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000050));

		} catch (final Exception excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000052),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000049));
		}

		return listaResultados;
	}

	private final Optional<EjercicioEntity> ejecutarConsultaPorId(final PreparedStatement sentenciaPreparada) {
		Optional<EjercicioEntity> resultado = Optional.empty();
		try (final var resultados = sentenciaPreparada.executeQuery()) {
			if (resultados.next()) {
				final var clienteEntity = EjercicioEntity.crear(
						UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),
						resultados.getString("nombre"), resultados.getString("descripcion"),
						resultados.getObject("serie", SerieEntity.class));
				resultado = Optional.of(clienteEntity);
			}
		} catch (SQLException excepcion) {
			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000048),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000049));
		}
		return resultado;
	}

}
