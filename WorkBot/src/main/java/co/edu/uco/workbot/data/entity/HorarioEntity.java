package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class HorarioEntity {
	
	private UUID id;
	private int horaInicio;
	private int horaFinalizacion;
	private CalendarioEntity calendario;
	
	public HorarioEntity(UUID id, int horaInicio, int horaFinalizacion,CalendarioEntity calendario) {
		
		setId(id);
		setHoraInicio(horaInicio);
		setHoraFinalizacion(horaFinalizacion);
	setCalendario(calendario);
	}

	public static final HorarioEntity crear(UUID id, int horaInicio, int horaFinalizacion,CalendarioEntity calendario) {
		return new HorarioEntity(id, horaInicio, horaFinalizacion,calendario);
	}
	
	public final UUID getId() {
		return id;
	}

	public final int getHoraInicio() {
		return horaInicio;
	}

	public final int getHoraFinalizacion() {
		return horaFinalizacion;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	private final void setHoraInicio(int horaInicio) {
		this.horaInicio = UtilTiempo.obtenerValorDefectoHora(horaInicio);
	}

	private final void setHoraFinalizacion(int horaFinalizacion) {
		this.horaFinalizacion =UtilTiempo.obtenerValorDefectoHora(horaFinalizacion);
	}

	public final CalendarioEntity getCalendario() {
		return calendario;
	}

	private final void setCalendario(CalendarioEntity calendario) {
		this.calendario = calendario;
	}
	
	
	
	

}
