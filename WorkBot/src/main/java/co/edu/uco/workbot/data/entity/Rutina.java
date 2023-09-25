package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class Rutina {

	private UUID id;
	private String nombre;
	private String descripcion;
	private Ejercicio ejercicio;

	public Rutina(UUID id, String nombre, String descripcion, Ejercicio ejercicio) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEjercicio(ejercicio);
	}
	
	public static final Rutina create(UUID id, String nombre, String descripcion, Ejercicio ejercicio) {
		return new Rutina(id, nombre, descripcion, ejercicio);
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

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public final Ejercicio getEjercicio() {
		return ejercicio;
	}

	private final void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

}
