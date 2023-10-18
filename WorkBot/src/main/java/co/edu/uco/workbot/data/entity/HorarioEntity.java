package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class HorarioEntity {
	
	private UUID id;
	private int horaInicio;
	private int horaFinalizacion;
	
	public HorarioEntity(UUID id, int horaInicio, int horaFinalizacion) {
		
		setId(id);
		setHoraInicio(horaInicio);
		setHoraFinalizacion(horaFinalizacion);
	
	}

	public static final HorarioEntity crear(UUID id, int horaInicio, int horaFinalizacion) {
		return new HorarioEntity(id, horaInicio, horaFinalizacion);
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
	
	

}
