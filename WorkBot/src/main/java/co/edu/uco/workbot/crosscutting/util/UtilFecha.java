package co.edu.uco.workbot.crosscutting.util;

import java.time.LocalDate;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


import co.edu.uco.workbot.crosscutting.exception.concrete.CrossCuttingWorkBotException;
import co.edu.uco.workbot.crosscutting.mensaje.CatalogoMensajes;

import co.edu.uco.workbot.crosscutting.mensaje.enumerator.CodigoMensaje;

import java.text.SimpleDateFormat;
public class UtilFecha {
	
	public static final void organizarFecha() {
		final DateFormat formateador= new SimpleDateFormat("dd/M/yy");
		try {
			final Date fecha= formateador.parse("10/01/2022");
			final Calendar calendario= new GregorianCalendar();
            //hacemos calculos sobre el calendario
            calendario.setTime(fecha);
            //movemos el calendario
            calendario.add(Calendar.DATE,5);
		}catch(Exception excepcion) {
			throw CrossCuttingWorkBotException.crear(CatalogoMensajes.obtenerContenidoMensaje(CodigoMensaje.M00000004));
		}
	}
	
	
	

	private UtilFecha() {
		super();
	}
	
	public static final short obtenerAño() {
		return (short)LocalDate.now().getYear();
	}
	

	public static final int obtenerHora() {
		return LocalDateTime.now().getHour();
	}
	
	public static final LocalDate TiempoCreacion() {
		return LocalDateTime.now().toLocalDate();
		
	}
	
	public static final String DEFAULT_DATE_AS_STRING = "2023-01-01";
	public static final LocalDate DEFAULT_DATE = LocalDate.parse(DEFAULT_DATE_AS_STRING,
			DateTimeFormatter.ISO_LOCAL_DATE);
	private static final String DATE_RE_STRING = "\\d{4}-\\d{2}-\\d{2}";
	public static final LocalDateTime DEFAULT_DATE_TIME= LocalDateTime.now();
		
	
	private static final UtilFecha INSTANCE = new UtilFecha();



	public static final UtilFecha obtenerUtilFecha() {
		return INSTANCE;
	}

	public static final LocalDate generarNuevaFecha() {
		return LocalDate.now();
	}

	public static final boolean fechaTextoEsValido(final String dateValue) {
		return (!UtilObjeto.esNulo(dateValue) && dateValue.matches(DATE_RE_STRING));
	}

	public static final LocalDate generarfechaDeTexto(final String fechaValue) {
		return (fechaTextoEsValido(fechaValue)) ? LocalDate.parse(fechaValue, DateTimeFormatter.ISO_LOCAL_DATE)
				: DEFAULT_DATE;
	}
	public static final LocalDateTime generarFechaDeTiempoTexto(final String fechaValue) {
		return (fechaTextoEsValido(fechaValue)) ? LocalDateTime.parse(fechaValue, DateTimeFormatter.ISO_LOCAL_DATE)
				: DEFAULT_DATE_TIME;
	}

	public static final LocalDate obtenerPorDefecto(final LocalDate dateValue) {
		return (UtilObjeto.esNulo(dateValue)) ? DEFAULT_DATE : dateValue;
	}
	public static final LocalDateTime obtenerTiempoPorDefecto(final LocalDateTime dateValue) {
		return (UtilObjeto.esNulo(dateValue)) ? DEFAULT_DATE_TIME : dateValue;
	}


	public final LocalDateTime isEmptyDateTime(final LocalDateTime dateValue) {
		return (UtilObjeto.esNulo(dateValue)) ? DEFAULT_DATE_TIME : dateValue;
	}
	
	public  final LocalDate IsEmptyDate(final LocalDate dateValue) {
		return (UtilObjeto.esNulo(dateValue)) ? DEFAULT_DATE : dateValue;
	}
}
