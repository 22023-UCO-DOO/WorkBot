package co.edu.uco.tiendaonline.data.dao.daofactory.concrete;

import java.sql.Connection;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.dao.concrete.sqlserver.ClienteSQLServerDAO;
import co.edu.uco.tiendaonline.data.dao.concrete.sqlserver.TipoIdentificacionSQLServerDAO;
import co.edu.uco.tiendaonline.data.dao.daofactory.DAOFactory;

public final class SQLServerDAOFactory extends DAOFactory {

	private Connection conexion;
	
	public SQLServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected final void abrirConexion() {
		// TODO Do this fucking thing or else (obtain connection with SQL Server database)
		conexion = null;
				
	}

	@Override
	public final void cerrarConexion() {
		// TODO DO THIS RAAHHHHHHH YOU FUCKING IDIOT!!!!!!! (Close Connection :])
		
	}

	@Override
	public void iniciarTransaccion() {
		// TODO peanis :) (Initiate Transaction)
		
	}

	@Override
	public void confirmarTransaccion() {
		// TODO (Commit Suici- ER I MEAN Transaction)
		
	}

	@Override
	public void cancelarTransaccion() {
		// TODO ROLLBACK IT ALL AAAAHHHHGGGHHHHH,.,..,,
		
	}

	@Override
	public ClienteDAO obtenerClienteDAO() {
		return new ClienteSQLServerDAO(conexion);
	}

	@Override
	public TipoIdentificacionDAO obtenerTipoIdentificacionDAO() {
		return new TipoIdentificacionSQLServerDAO(conexion);
	}
	
}
