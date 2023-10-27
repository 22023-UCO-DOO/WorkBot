package co.edu.uco.workbot.data.entity;

import java.sql.Time;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
public class DuracionEntity {
	
	private UUID id;
	private Time tiempo;
	
	
	
	public DuracionEntity(UUID id, Time tiempo) {
		setId(id);
		setTiempo(tiempo);
		
	}
	
	public static final DuracionEntity crear(UUID id, Time tiempo) {
		return new DuracionEntity(id, tiempo);
	}

	public final UUID getId() {
		return id;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	public final Time getTiempo() {
		return tiempo;
	}

	private final void setTiempo(Time tiempo) {
		this.tiempo = UtilTiempo.obtenerValorDefecto(tiempo);
	}
	
	

}
