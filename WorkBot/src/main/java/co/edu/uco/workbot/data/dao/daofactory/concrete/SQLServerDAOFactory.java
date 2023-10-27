package co.edu.uco.workbot.data.dao.daofactory.concrete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.workbot.crosscutting.exception.concrete.CrossCuttingWorkBotException;
import co.edu.uco.workbot.crosscutting.exception.concrete.DataWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;
import co.edu.uco.workbot.crosscutting.util.UtilSQL;
import co.edu.uco.workbot.data.dao.CalendarioDAO;
import co.edu.uco.workbot.data.dao.DuracionDAO;
import co.edu.uco.workbot.data.dao.EjercicioDAO;
import co.edu.uco.workbot.data.dao.EntrenadorDAO;
import co.edu.uco.workbot.data.dao.EstadoEntrenadorDAO;
import co.edu.uco.workbot.data.dao.MiembroDAO;
import co.edu.uco.workbot.data.dao.PlanEntrenamientoDAO;
import co.edu.uco.workbot.data.dao.RepeticionDAO;
import co.edu.uco.workbot.data.dao.RutinaDAO;
import co.edu.uco.workbot.data.dao.SerieDAO;
import co.edu.uco.workbot.data.dao.TipoDocumentoDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.CalendarioSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.DuracionSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.EjercicioSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.EntrenadorSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.EstadoEntrenadorSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.MiembroSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.PlanEntrenamientoSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.RepeticionSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.RutinaSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.SerieSQLServerDAO;
import co.edu.uco.workbot.data.dao.concrete.sqlserver.TipoDocumentoSQLServerDAO;
import co.edu.uco.workbot.data.dao.daofactory.DAOFactory;

public final class SQLServerDAOFactory extends DAOFactory {

	private Connection conexion;

	public SQLServerDAOFactory() {

		abrirConexion();
	}

	@Override
	protected final void abrirConexion() {
		try {

			conexion = DriverManager.getConnection(
					"jdbc:sqlserver://<server>:<port>;encrypt=false;databaseName=<database>;user=<user>;password=<password>");
		} catch (final SQLException excepcion) {

			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000027));
		} catch (final Exception excepcion) {

			throw DataWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000028));
		}
	}

	@Override
	public final void cerrarConexion() {
		UtilSQL.cerrarConexion(conexion);
	}

	@Override
	public final void iniciarTransaccion() {
		UtilSQL.iniciarTransaccion(conexion);
	}

	@Override
	public final void confirmarTransaccion() {
		UtilSQL.confirmarTransaccion(conexion);
	}

	@Override
	public final void cancelrTransaccion() {
		UtilSQL.cancelarTransaccion(conexion);
	}

	@Override
	public CalendarioDAO obtenerCalendarioDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000033));
		}

		return new CalendarioSQLServerDAO(conexion);
	}

	@Override
	public DuracionDAO obtenerDuracionDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000034));
		}

		return new DuracionSQLServerDAO(conexion);
	}

	@Override
	public EjercicioDAO obtenerEjercicioDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000036));
		}

		return new EjercicioSQLServerDAO(conexion);
	}

	@Override
	public EntrenadorDAO obtenerEntrenadorDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000037));
		}

		return new EntrenadorSQLServerDAO(conexion);
	}

	@Override
	public EstadoEntrenadorDAO obtenerEstadoEntrenadorDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000038));
		}

		return new EstadoEntrenadorSQLServerDAO(conexion);
	}

	@Override
	public MiembroDAO obtenerMiembroDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000039));
		}

		return new MiembroSQLServerDAO(conexion);
	}

	@Override
	public PlanEntrenamientoDAO obtenerPlanEntrenamientoDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000040));
		}

		return new PlanEntrenamientoSQLServerDAO(conexion);
	}

	@Override
	public RepeticionDAO obtenerRepeticionDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000041));
		}

		return new RepeticionSQLServerDAO(conexion);
	}

	@Override
	public RutinaDAO obtenerRutinaDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000034));
		}

		return new RutinaSQLServerDAO(conexion);
	}

	@Override
	public SerieDAO obtenerSerieDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000034));
		}

		return new SerieSQLServerDAO(conexion);
	}

	@Override
	public TipoDocumentoDAO obtenerTipoDocumentoDAO() {

		if (!UtilSQL.conexionAbierta(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000034));
		}

		return new TipoDocumentoSQLServerDAO(conexion);
	}

}
