package co.edu.uco.workbot.data.entity;

import java.util.Timer;
import java.util.UUID;

public class Duracion {
	
	private UUID id;
	private Timer tiempo;
	
	public Duracion(UUID id, Timer tiempo) {
		setId(id);
		setTiempo(tiempo);
		
	}
	
	public static final Duracion crear(UUID id, Timer tiempo) {
		return new Duracion(id, tiempo);
	}

	public final UUID getId() {
		return id;
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	public final Timer getTiempo() {
		return tiempo;
	}

	private final void setTiempo(Timer tiempo) {
		this.tiempo = tiempo;
	}
	
	

}
