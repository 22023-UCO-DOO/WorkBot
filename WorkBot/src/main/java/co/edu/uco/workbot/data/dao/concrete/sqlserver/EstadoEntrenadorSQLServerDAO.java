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
import co.edu.uco.workbot.data.dao.EstadoEntrenadorDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;

import co.edu.uco.workbot.data.entity.EstadoEntrenadorEntity;

public class EstadoEntrenadorSQLServerDAO extends SQLDAO implements EstadoEntrenadorDAO{

	public EstadoEntrenadorSQLServerDAO(Connection conexion) {
		super(conexion);
		
	}

	@Override
	public Optional<EstadoEntrenadorEntity> consultarPorId(UUID id) {
		final var sentencia = new StringBuilder();
		sentencia.append("SELECT id, nombre ");
		sentencia.append("FROM EstadoEntrenador ");
		sentencia.append("WHERE id = ? ");

		Optional<EstadoEntrenadorEntity> resultado = Optional.empty();

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
		private final Optional<EstadoEntrenadorEntity> ejecutarConsultaPorId(final PreparedStatement sentenciaPreparada) {
			Optional<EstadoEntrenadorEntity> resultado = Optional.empty();
			try (final var resultados = sentenciaPreparada.executeQuery()) {
				if (resultados.next()) {
					final var tipoIdentificacionEntity = EstadoEntrenadorEntity.crear(
							UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),resultados.getString("nombre"));
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
	public List<EstadoEntrenadorEntity> consultar(EstadoEntrenadorEntity entity) {
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
	private final String formarSentenciaConsulta(final EstadoEntrenadorEntity entity, final List<Object> parametros) {

		final StringBuilder sentencia = new StringBuilder();
		String operadorCondicional = "WHERE";

		sentencia.append("SELECT id,nombre ");
		sentencia.append("FROM EstadoEntrenador ");
		if (!UtilObjeto.esNulo(entity)) {
			if (!UtilObjeto.esNulo(entity.getId())) {
				sentencia.append(operadorCondicional).append(" id=? ");
				operadorCondicional = "AND";
				parametros.add(entity.getId());
			}
			
			
			if (!UtilTexto.estaNulo(entity.getNombre())) {
				sentencia.append(operadorCondicional).append(" nombre=? ");
				
				parametros.add(entity.getNombre());
			}
		}

		sentencia.append(" ORDER BY nombre ASC ");
		return sentencia.toString();
	}

	private final List<EstadoEntrenadorEntity> ejecutarConsulta(final PreparedStatement sentenciaPreparada) {
		final var listaResultados = new ArrayList<EstadoEntrenadorEntity>();

		try (final var resultados = sentenciaPreparada.executeQuery()) {
			while (resultados.next()) {
				var tipoIdentificacionEntity = EstadoEntrenadorEntity.crear(
						UtilUUID.obtenerUUIDDeTexto(resultados.getObject("id").toString()),
						
						resultados.getString("nombre"));
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
