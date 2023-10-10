package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class RutinaEntity {

	private UUID id;
	private String nombre;
	private String descripcion;
	private EjercicioEntity ejercicioEntity;

	public RutinaEntity(UUID id, String nombre, String descripcion, EjercicioEntity ejercicioEntity) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEjercicio(ejercicioEntity);
	}
	
	public static final RutinaEntity create(UUID id, String nombre, String descripcion, EjercicioEntity ejercicioEntity) {
		return new RutinaEntity(id, nombre, descripcion, ejercicioEntity);
	}

	public final UUID getId() {
		return id;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilTexto.aplicarTrim(descripcion);
	}

	public final EjercicioEntity getEjercicio() {
		return ejercicioEntity;
	}

	private final void setEjercicio(EjercicioEntity ejercicioEntity) {
		this.ejercicioEntity = ejercicioEntity;
	}

}
