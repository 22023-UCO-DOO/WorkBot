package co.edu.uco.workbot.service.dto;

import java.sql.Time;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
public class DuracionDTO {
	
	private UUID id;
	private Time tiempo;
	
	public DuracionDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setTiempo(UtilTiempo.asignarTiempoPorDefecto());
	}
	
	public DuracionDTO(UUID id, Time tiempo) {
		setId(id);
		setTiempo(tiempo);
		
	}
	
	public static final DuracionDTO crear(UUID id, Time tiempo) {
		return new DuracionDTO(id, tiempo);
	}

	public final UUID getId() {
		return id;
	}

	public final DuracionDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final Time getTiempo() {
		return tiempo;
	}

	public final DuracionDTO setTiempo(Time tiempo) {
		this.tiempo = UtilTiempo.obtenerValorDefecto(tiempo);return this;
	}
	
	

}
