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

import co.edu.uco.workbot.data.dao.EntrenadorDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;

import co.edu.uco.workbot.data.entity.EntrenadorEntity;
import co.edu.uco.workbot.data.entity.MiembroEntity;

import co.edu.uco.workbot.data.entity.support.EntrenadorDatosEntity;

public class EntrenadorSQLServerDAO extends SQLDAO implements EntrenadorDAO{

	public EntrenadorSQLServerDAO(Connection conexion) {
		super(conexion);

	}

	@Override
	public void crear(EntrenadorEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("INSERT INTO Entrenador (miembro, datosentrenador) ");
		sentencia.append("VALUES (?,?) ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getMiembro());
			sentenciaPreparada.setObject(2, entity.getDatosEntrenador());
		
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
	public void modificar(EntrenadorEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("UPDATE Entrenador ");
		sentencia.append("SET miembro=?, datosentrenador=?");
		sentencia.append("WHERE miembro=? ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getMiembro());
			sentenciaPreparada.setObject(2, entity.getDatosEntrenador());
	

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
	public Optional<EntrenadorEntity> consultarPorId(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("SELECT miembro,datosentrenador ");
		sentencia.append("FROM Entrenador ");
		sentencia.append("WHERE miembro = ? ");

		Optional<EntrenadorEntity> resultado = Optional.empty();
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
	public List<EntrenadorEntity> consultar(EntrenadorEntity entity) {
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

	private final String formarSentenciaConsulta(final EntrenadorEntity entity, final List<Object> parametros) {

		final StringBuilder sentencia = new StringBuilder();
		String operadorCondicional = "WHERE";

		sentencia.append("SELECT miembro, datosentrenador ");
		sentencia.append("FROM Entrenador ");
		if (!UtilObjeto.esNulo(entity)) {
			if (!UtilObjeto.esNulo(entity.getMiembro())) {
				sentencia.append(operadorCondicional).append(" id=? ");
				operadorCondicional = "AND";
				parametros.add(entity.getMiembro());
			}
			if (!UtilObjeto.esNulo(entity.getDatosEntrenador())) {
				sentencia.append(operadorCondicional).append(" nombre=? ");
				
				parametros.add(entity.getDatosEntrenador());
			}

			
		}

		sentencia.append(" ORDER BY nombre ASC ");
		return sentencia.toString();
	}

	private final List<EntrenadorEntity> ejecutarConsulta(final PreparedStatement sentenciaPreparada) {
		final var listaResultados = new ArrayList<EntrenadorEntity>();

		try (final var resultados = sentenciaPreparada.executeQuery()) {
			while (resultados.next()) {
				var tipoIdentificacionEntity = EntrenadorEntity.crear(
						
						resultados.getObject("miembro", MiembroEntity.class),
						resultados.getObject("datosentrenador", EntrenadorDatosEntity.class));
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

	private final Optional<EntrenadorEntity> ejecutarConsultaPorId(final PreparedStatement sentenciaPreparada) {
		Optional<EntrenadorEntity> resultado = Optional.empty();
		try (final var resultados = sentenciaPreparada.executeQuery()) {
			if (resultados.next()) {
				final var clienteEntity = EntrenadorEntity.crear(
						resultados.getObject("miembro", MiembroEntity.class),
						resultados.getObject("datosentrenador", EntrenadorDatosEntity.class));
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
