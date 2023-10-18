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

import co.edu.uco.workbot.crosscutting.util.UtilNumero;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
import co.edu.uco.workbot.data.dao.RepeticionDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;

import co.edu.uco.workbot.data.entity.RepeticionEntity;


public class RepeticionSQLServerDAO extends SQLDAO implements RepeticionDAO{

	public RepeticionSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<RepeticionEntity> consultarPorId(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("SELECT id, fecha ");
		sentencia.append("FROM Calendario ");
		sentencia.append("WHERE id = ? ");

		Optional<RepeticionEntity> resultado = Optional.empty();

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
		private final Optional<RepeticionEntity> ejecutarConsultaPorId(final PreparedStatement sentenciaPreparada) {
			Optional<RepeticionEntity> resultado = Optional.empty();
			try (final var resultados = sentenciaPreparada.executeQuery()) {
				if (resultados.next()) {
					final var tipoIdentificacionEntity = RepeticionEntity.crear(
							UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),resultados.getInt("cantidad"));
					resultado = Optional.of(tipoIdentificacionEntity);
				}
			} catch (SQLException excepcion) {
				throw DataWorkBotException.crear(excepcion,
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000048),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000049));
			}
			return resultado;
		}
	
	@Override
	public List<RepeticionEntity> consultar(RepeticionEntity entity) {
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
	private final String formarSentenciaConsulta(final RepeticionEntity entity, final List<Object> parametros) {

		final StringBuilder sentencia = new StringBuilder();
		String operadorCondicional = "WHERE";

		sentencia.append("SELECT id,fecha ");
		sentencia.append("FROM Repeticion ");
		if (!UtilObjeto.esNulo(entity)) {
			if (!UtilObjeto.esNulo(entity.getId())) {
				sentencia.append(operadorCondicional).append(" id=? ");
				operadorCondicional = "AND";
				parametros.add(entity.getId());
			}
			
			
			if (!UtilNumero.estaNulo(entity.getCantidad())) {
				sentencia.append(operadorCondicional).append(" cantidad=? ");
				
				parametros.add(entity.getCantidad());
			}
		}

		sentencia.append(" ORDER BY cantidad ASC ");
		return sentencia.toString();
	}

	private final List<RepeticionEntity> ejecutarConsulta(final PreparedStatement sentenciaPreparada) {
		final var listaResultados = new ArrayList<RepeticionEntity>();

		try (final var resultados = sentenciaPreparada.executeQuery()) {
			while (resultados.next()) {
				var tipoIdentificacionEntity = RepeticionEntity.crear(
						UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),
						
						resultados.getInt("numero"));
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



	@Override
	public void crear(RepeticionEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("INSERT INTO Repeticion (id, cantidad ");
		sentencia.append("VALUES (?,?) ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getId());

			sentenciaPreparada.setInt(2, entity.getCantidad());

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

}
