package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class PlanEntrenamiento {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private Entrenador creador;
	private Rutina rutina;
	private Duracion duracion;
	public PlanEntrenamiento(UUID id, String nombre, String descripcion, Entrenador creador, Rutina rutina,
			Duracion duracion) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setCreador(creador);
		setRutina(rutina);
		setDuracion(duracion);
	}
	
	public static final PlanEntrenamiento crear(UUID id, String nombre, String descripcion, Entrenador creador, Rutina rutina,
			Duracion duracion) { 
		return new PlanEntrenamiento(id, nombre, descripcion, creador, rutina, duracion);
					
		
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

	public final Entrenador getCreador() {
		return creador;
	}

	private final void setCreador(Entrenador creador) {
		this.creador = creador;
	}

	public final Rutina getRutina() {
		return rutina;
	}

	private final void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	public final Duracion getDuracion() {
		return duracion;
	}

	private final void setDuracion(Duracion duracion) {
		this.duracion = duracion;
	}
	
	

}
