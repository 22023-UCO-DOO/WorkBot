package co.edu.uco.workbot.data.dao.daofactory;

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


public abstract class DAOFactory {
	
	

	protected abstract void abrirConexion() ;
	
	public abstract void cerrarConexion();
	
	public abstract void iniciarTransaccion();
	
	public abstract void confirmarTransaccion();
	
	public abstract void cancelrTransaccion();
	
	public abstract CalendarioDAO obtenerCalendarioDAO();
	
	public abstract DuracionDAO obtenerDuracionDAO();
	
	public abstract EjercicioDAO obtenerEjercicioDAO();
	
	public abstract EntrenadorDAO obtenerEntrenadorDAO();
	
	public abstract EstadoEntrenadorDAO obtenerEstadoEntrenadorDAO();
	
	public abstract MiembroDAO obtenerMiembroDAO();
	
	public abstract PlanEntrenamientoDAO obtenerPlanEntrenamientoDAO();
	
	public abstract RepeticionDAO obtenerRepeticionDAO();
	
	public abstract RutinaDAO obtenerRutinaDAO();
	
	public abstract SerieDAO obtenerSerieDAO();
	
	public abstract TipoDocumentoDAO obtenerTipoDocumentoDAO();
}
