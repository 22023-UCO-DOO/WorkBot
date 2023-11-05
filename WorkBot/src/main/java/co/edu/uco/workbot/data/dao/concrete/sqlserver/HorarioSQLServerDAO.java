package co.edu.uco.workbot.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.workbot.crosscutting.exception.concrete.DataWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;
import co.edu.uco.workbot.data.dao.HorarioDAO;
import co.edu.uco.workbot.data.dao.base.SQLDAO;
import co.edu.uco.workbot.data.entity.HorarioEntity;

public class HorarioSQLServerDAO extends SQLDAO implements HorarioDAO{

	protected HorarioSQLServerDAO(Connection conexion) {
		super(conexion);
	
	}

	@Override
	public void crear(HorarioEntity entity) {
		final var sentencia = new StringBuilder();
		sentencia.append("INSERT INTO Horario (id, horainicio, horafin, calendario ");
		sentencia.append("VALUES (?,?,?,?) ");

		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {

			sentenciaPreparada.setObject(1, entity.getId());

			sentenciaPreparada.setInt(2, entity.getHoraInicio());
			sentenciaPreparada.setInt(3, entity.getHoraFinalizacion());
			sentenciaPreparada.setObject(4, entity.getCalendario());
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
	public void modificar(HorarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<HorarioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<HorarioEntity> consultar(HorarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
