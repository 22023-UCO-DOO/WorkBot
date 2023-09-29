package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class EjercicioEntity {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private SerieEntity serieEntity;
	public EjercicioEntity(UUID id, String nombre, String descripcion, SerieEntity serieEntity) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setSerie(serieEntity);
	}
	
	public static final EjercicioEntity crear(UUID id, String nombre, String descripcion, SerieEntity serieEntity) {
		return new EjercicioEntity(id, nombre, descripcion, serieEntity);
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
	public final SerieEntity getSerie() {
		return serieEntity;
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
	private final void setSerie(SerieEntity serieEntity) {
		this.serieEntity = serieEntity;
	}
	
	

}
