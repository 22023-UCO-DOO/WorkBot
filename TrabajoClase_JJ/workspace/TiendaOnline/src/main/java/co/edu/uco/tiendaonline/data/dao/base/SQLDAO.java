package co.edu.uco.tiendaonline.data.dao.base;

import java.sql.Connection;

public class SQLDAO {
	private Connection conexion;
	protected SQLDAO(final Connection conexion) {
		setConexion(conexion);
	}
	private final void setConexion(final Connection conexion) {
		// TODO: Controlar que la conexion no sea nula o que no sea cerrada o 
		// que ya no se haya confirmado una transaccion.
		this.conexion = conexion;
	}
	protected final Connection getConexion() {
		return conexion;
	}
	
}
