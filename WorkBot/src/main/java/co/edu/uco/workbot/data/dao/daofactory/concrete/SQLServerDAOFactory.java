package co.edu.uco.workbot.data.dao.daofactory.concrete;

import java.sql.Connection;
import java.sql.SQLException;

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

public final class SQLServerDAOFactory extends DAOFactory{

	private Connection conexion;

	public SQLServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected final void abrirConexion() {

		try {
			if (conexion != null && !conexion.isClosed()) {
				System.out.println("La conexion esta abierta");
			}
		} catch (final SQLException exception) {
			throw new RuntimeException("Falla en la conexion");
		}

	}

	@Override
	public final void cerrarConexion() {
		try {
			if (!conexion.isClosed()) {
				System.out.println("La conexion ya se ha cerrado");
			}
			conexion.close();
		}

		catch (final SQLException exception) {
			throw new RuntimeException("Conexion cerrada");
		}

	}

	@Override
	public final void iniciarTransaccion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				System.out.println("La conexion esta abierta");
			}
			conexion.setAutoCommit(false);

		} catch (final SQLException exception) {
			throw new RuntimeException("Ha ocurrido un problema a la hora de iniciar la transaccion");
		}

	}

	@Override
	public final void confirmarTransaccion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				System.out.println("La conexion esta abierta");
			}
			conexion.setAutoCommit(true);
		}

		catch (final SQLException exception) {
			throw new RuntimeException("Ha ocurrido un error inesperado a la hora de realizar la transaccion");
		}
	}

	@Override
	public final void cancelrTransaccion() {
		try {
			if (conexion != null && !conexion.isClosed()) {
				System.out.println("La conexion esta abierta");
			}
			conexion.rollback();
		}

		catch (final SQLException exception) {
			throw new RuntimeException("Ha ocurrido un error inesperado a la hora de realizar la transaccion");
		}
	}

	@Override
	public CalendarioDAO obtenerCalendarioDAO() {
		
		return new CalendarioSQLServerDAO(conexion);
	}

	@Override
	public DuracionDAO obtenerDuracionDAO() {
		
		return new DuracionSQLServerDAO(conexion);
	}

	@Override
	public EjercicioDAO obtenerEjercicioDAO() {
		
		return new EjercicioSQLServerDAO(conexion);
	}

	@Override
	public EntrenadorDAO obtenerEntrenadorDAO() {
		
		return new EntrenadorSQLServerDAO(conexion);
	}

	@Override
	public EstadoEntrenadorDAO obtenerEstadoEntrenadorDAO() {
		
		return new EstadoEntrenadorSQLServerDAO(conexion);
	}

	@Override
	public MiembroDAO obtenerMiembroDAO() {
	
		return new MiembroSQLServerDAO(conexion);
	}

	@Override
	public PlanEntrenamientoDAO obtenerPlanEntrenamientoDAO() {
	
		return new PlanEntrenamientoSQLServerDAO(conexion);
	}

	@Override
	public RepeticionDAO obtenerRepeticionDAO() {
		
		return new RepeticionSQLServerDAO(conexion);
	}

	@Override
	public RutinaDAO obtenerRutinaDAO() {
		
		return new RutinaSQLServerDAO(conexion);
	}

	@Override
	public SerieDAO obtenerSerieDAO() {
		
		return new SerieSQLServerDAO(conexion);
	}

	@Override
	public TipoDocumentoDAO obtenerTipoDocumentoDAO() {

		return new TipoDocumentoSQLServerDAO(conexion);
	}

}
