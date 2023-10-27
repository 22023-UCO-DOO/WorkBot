package co.edu.uco.workbot.crosscutting.util;

import java.sql.Connection;
import java.sql.SQLException;


import co.edu.uco.workbot.crosscutting.exception.concrete.CrossCuttingWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;
import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;


public class UtilSQL {

	private UtilSQL() {
		super();
	}

	public static final boolean conexionAbierta(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {

			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000007));
		}

		try {
			return !conexion.isClosed();
		} catch (final SQLException excepcion) {

			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000005));
		} catch (final Exception excepcion) {

			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000006));
		}
	}

	public static final void cerrarConexion(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {

			throw CrossCuttingWorkBotException.crear(
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000026));
		}

		try {
			if (!conexionAbierta(conexion)) {

				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000008));
			}

			conexion.close();
		} catch (final CrossCuttingWorkBotException excepcion) {
			throw excepcion;
		} catch (final SQLException excepcion) {
		
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000009));
		} catch (final Exception excepcion) {
			
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000010));
		}
	}

	public static final void iniciarTransaccion(final Connection conexion) {
		if (UtilObjeto.esNulo(conexion)) {
	
			throw CrossCuttingWorkBotException.crear(
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000011));
		}

		try {
			if (!conexionAbierta(conexion)) {

				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000012));
			}

			if (!conexion.getAutoCommit()) {
			
				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000013));
			}

			conexion.setAutoCommit(false);
		} catch (final CrossCuttingWorkBotException excepcion) {
			throw excepcion;
		} catch (final SQLException excepcion) {
		
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000014));
		} catch (final Exception excepcion) {
		
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000015));
		}
	}

	public static final void confirmarTransaccion(final Connection conexion) {

		if (UtilObjeto.esNulo(conexion)) {
		
			throw CrossCuttingWorkBotException.crear(
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000016));
		}

		try {
			if (!conexionAbierta(conexion)) {
				
				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000017));
			}

			if (conexion.getAutoCommit()) {
		
				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000018));
			}

			conexion.commit();
		} catch (final CrossCuttingWorkBotException excepcion) {
			throw excepcion;
		} catch (final SQLException excepcion) {
	
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000019));
		} catch (final Exception excepcion) {
	
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000020));
		}
	}

	public static final void cancelarTransaccion(final Connection conexion) {

		if (UtilObjeto.esNulo(conexion)) {
		
			throw CrossCuttingWorkBotException.crear(
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M000000021));
		}

		try {
			if (!conexionAbierta(conexion)) {
	
				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000022));
			}

			if (conexion.getAutoCommit()) {
			
				throw CrossCuttingWorkBotException.crear(
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
						CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000023));
			}

			conexion.rollback();
		} catch (final CrossCuttingWorkBotException excepcion) {
			throw excepcion;
		} catch (final SQLException excepcion) {
		
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000024));
		} catch (final Exception excepcion) {
		
			throw CrossCuttingWorkBotException.crear(excepcion,
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004),
					CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000025));
		}
	}
}
