package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class Serie {
	
	private UUID id;
	private Duracion duracion;
	private Repeticion repeticion;
	public Serie(UUID id, Duracion duracion, Repeticion repeticion) {
		setId(id);
		setDuracion(duracion);
		setRepeticion(repeticion);
	}
	
	public static final Serie crear(UUID id, Duracion duracion, Repeticion repeticion) {
		return new Serie(id, duracion, repeticion);
	}
	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = id;
	}
	public final Duracion getDuracion() {
		return duracion;
	}
	private final void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}
	public final Repeticion getRepeticion() {
		return repeticion;
	}
	private final void setRepeticion(Repeticion repeticion) {
		this.repeticion = repeticion;
	}
	
	

}
