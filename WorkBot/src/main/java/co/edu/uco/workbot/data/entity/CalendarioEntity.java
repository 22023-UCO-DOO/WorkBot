package co.edu.uco.workbot.data.entity;


import java.util.GregorianCalendar;
import java.util.UUID;

public class CalendarioEntity {
	
	private UUID id;
	private GregorianCalendar dia;
	private GregorianCalendar mes;
	private GregorianCalendar ano;
	
	public CalendarioEntity(UUID id, GregorianCalendar dia, GregorianCalendar mes, GregorianCalendar ano) {
		setId(id);
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public static final CalendarioEntity crear(UUID id, GregorianCalendar dia, GregorianCalendar mes, GregorianCalendar ano) {
		return new CalendarioEntity(id, dia, mes, ano);
	}
	
	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setDia(GregorianCalendar dia) {
		this.dia = dia;
	}

	private final void setMes(GregorianCalendar mes) {
		this.mes = mes;
	}

	private final void setAno(GregorianCalendar ano) {
		this.ano = ano;
	}

	public final UUID getId() {
		return id;
	}

	public final GregorianCalendar getDia() {
		return dia;
	}

	public final GregorianCalendar getMes() {
		return mes;
	}

	public final GregorianCalendar getAno() {
		return ano;
	}
	
	
	
	

}
