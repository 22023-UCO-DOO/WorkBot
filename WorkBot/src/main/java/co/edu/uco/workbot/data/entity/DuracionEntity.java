package co.edu.uco.workbot.data.entity;

import java.util.Timer;
import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class DuracionEntity {
	
	private UUID id;
	private Timer tiempo;
	
	public DuracionEntity(UUID id, Timer tiempo) {
		setId(id);
		setTiempo(tiempo);
		
	}
	
	public static final DuracionEntity crear(UUID id, Timer tiempo) {
		return new DuracionEntity(id, tiempo);
	}

	public final UUID getId() {
		return id;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	public final Timer getTiempo() {
		return tiempo;
	}

	private final void setTiempo(Timer tiempo) {
		this.tiempo = tiempo;
	}
	
	

}
