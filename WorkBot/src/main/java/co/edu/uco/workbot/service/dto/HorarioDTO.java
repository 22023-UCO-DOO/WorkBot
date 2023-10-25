package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class HorarioDTO {
	
	private UUID id;
	private int horaInicio;
	private int horaFinalizacion;
	private CalendarioDTO calendario;
	
	public HorarioDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setHoraInicio(UtilTiempo.asignarHoraPorDefecto());
		setHoraFinalizacion(UtilTiempo.asignarHoraPorDefecto());
		setCalendario(new CalendarioDTO());
	}
	
	public HorarioDTO(UUID id, int horaInicio, int horaFinalizacion,CalendarioDTO calendario) {
		
		setId(id);
		setHoraInicio(horaInicio);
		setHoraFinalizacion(horaFinalizacion);
	setCalendario(calendario);
	}

	public static final HorarioDTO crear(UUID id, int horaInicio, int horaFinalizacion, CalendarioDTO calendario) {
		return new HorarioDTO(id, horaInicio, horaFinalizacion,calendario);
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

	private final HorarioDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	private final HorarioDTO setHoraInicio(int horaInicio) {
		this.horaInicio = UtilTiempo.obtenerValorDefectoHora(horaInicio);return this;
	}

	private final HorarioDTO setHoraFinalizacion(int horaFinalizacion) {
		this.horaFinalizacion =UtilTiempo.obtenerValorDefectoHora(horaFinalizacion);return this;
	}

	public final CalendarioDTO getCalendario() {
		return calendario;
	}

	public final void setCalendario(CalendarioDTO calendario) {
		this.calendario = calendario;
	}
	
	

}
