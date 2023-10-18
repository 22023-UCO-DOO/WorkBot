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
import co.edu.uco.workbot.crosscutting.util.UtilFechaUtil;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
import co.edu.uco.workbot.data.dao.DuracionDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;

import co.edu.uco.workbot.data.entity.DuracionEntity;

public class DuracionSQLServerDAO extends SQLDAO implements DuracionDAO{

	public DuracionSQLServerDAO(Connection conexion) {
		super(conexion);
	
	}

	@Override
	public void crear(DuracionEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("INSERT INTO Duracion (id, tiempo ");
		sentencia.append("VALUES (?,?) ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getId());

			sentenciaPreparada.setTime(2, entity.getTiempo());

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
	public Optional<DuracionEntity> consultarPorId(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("SELECT id, fecha ");
		sentencia.append("FROM Calendario ");
		sentencia.append("WHERE id = ? ");

		Optional<DuracionEntity> resultado = Optional.empty();

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
		private final Optional<DuracionEntity> ejecutarConsultaPorId(final PreparedStatement sentenciaPreparada) {
			Optional<DuracionEntity> resultado = Optional.empty();
			try (final var resultados = sentenciaPreparada.executeQuery()) {
				if (resultados.next()) {
					final var tipoIdentificacionEntity = DuracionEntity.crear(
							UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),resultados.getTime("fecha"));
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
	public List<DuracionEntity> consultar(DuracionEntity entity) {
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
	private final String formarSentenciaConsulta(final DuracionEntity entity, final List<Object> parametros) {

		final StringBuilder sentencia = new StringBuilder();
		String operadorCondicional = "WHERE";

		sentencia.append("SELECT id,fecha ");
		sentencia.append("FROM Calendario ");
		if (!UtilObjeto.esNulo(entity)) {
			if (!UtilObjeto.esNulo(entity.getId())) {
				sentencia.append(operadorCondicional).append(" id=? ");
				operadorCondicional = "AND";
				parametros.add(entity.getId());
			}
			
			
			if (!UtilFechaUtil.estaNulo(entity.getTiempo())) {
				sentencia.append(operadorCondicional).append(" tiempo=? ");
				
				parametros.add(entity.getTiempo());
			}
		}

		sentencia.append(" ORDER BY tiempo ASC ");
		return sentencia.toString();
	}

	private final List<DuracionEntity> ejecutarConsulta(final PreparedStatement sentenciaPreparada) {
		final var listaResultados = new ArrayList<DuracionEntity>();

		try (final var resultados = sentenciaPreparada.executeQuery()) {
			while (resultados.next()) {
				var tipoIdentificacionEntity = DuracionEntity.crear(
						UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),
						
						resultados.getTime("fecha"));
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

}
