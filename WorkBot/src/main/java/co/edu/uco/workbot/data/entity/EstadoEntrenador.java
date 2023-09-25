package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class EstadoEntrenador {

	private UUID id;
	private String nombre;
	public EstadoEntrenador(UUID id, String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public static final EstadoEntrenador crear(UUID id, String nombre) {
	return new EstadoEntrenador(id, nombre);	
	}
	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = id;
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
