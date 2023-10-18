package co.edu.uco.workbot.crosscutting.util;

import java.sql.Time;
import java.util.Calendar;

public class UtilTiempo {

	protected static final Time TIEMPO_POR_DEFECTO_TIMER = new Time(1000);
	public static final String TIEMPO_POR_DEFECTO_TEXTO = TIEMPO_POR_DEFECTO_TIMER.toString();
	
	protected static final int HORA_POR_DEFECTO=Calendar.HOUR_OF_DAY;

	private UtilTiempo() {

	}

	public static final Time obtenerValorDefecto(final Time valor, final Time valorDefecto) {
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
	}

	public static final Time obtenerValorDefecto(final Time valor) {
		return obtenerValorDefecto(valor, TIEMPO_POR_DEFECTO_TIMER);
	}
	
	public static final Time asignarTiempoPorDefecto() {
		return TIEMPO_POR_DEFECTO_TIMER;
	}
	public static final int obtenerValorDefectoHora(final int valor, final int valorDefecto) {
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
	}

	public static final int obtenerValorDefectoHora(final int valor) {
		return obtenerValorDefectoHora(valor, HORA_POR_DEFECTO);
	}
	
	public static final int asignarHoraPorDefecto() {
		return HORA_POR_DEFECTO;
	}
	
	public static final boolean estaNulo(final int valor) {
		return UtilObjeto.esNulo(valor);
	}
	
	public static final boolean estaNulo(final Time valor ) {
		return UtilObjeto.esNulo(valor);
	}
}
