package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class Ejercicio {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private Serie serie;
	public Ejercicio(UUID id, String nombre, String descripcion, Serie serie) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setSerie(serie);
	}
	
	public static final Ejercicio crear(UUID id, String nombre, String descripcion, Serie serie) {
		return new Ejercicio(id, nombre, descripcion, serie);
	}
	public final UUID getId() {
		return id;
	}
	public final String getNombre() {
		return nombre;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final Serie getSerie() {
		return serie;
	}
	private final void setId(UUID id) {
		this.id = id;
	}
	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private final void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	

}
