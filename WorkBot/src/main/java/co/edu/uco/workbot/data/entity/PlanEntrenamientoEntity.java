package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class PlanEntrenamientoEntity {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private EntrenadorEntity creador;
	private RutinaEntity rutinaEntity;
	private DuracionEntity duracionEntity;
	public PlanEntrenamientoEntity(UUID id, String nombre, String descripcion, EntrenadorEntity creador, RutinaEntity rutinaEntity,
			DuracionEntity duracionEntity) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setCreador(creador);
		setRutina(rutinaEntity);
		setDuracion(duracionEntity);
	}
	
	public static final PlanEntrenamientoEntity crear(UUID id, String nombre, String descripcion, EntrenadorEntity creador, RutinaEntity rutinaEntity,
			DuracionEntity duracionEntity) { 
		return new PlanEntrenamientoEntity(id, nombre, descripcion, creador, rutinaEntity, duracionEntity);
					
		
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
		this.nombre = nombre;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public final EntrenadorEntity getCreador() {
		return creador;
	}

	private final void setCreador(EntrenadorEntity creador) {
		this.creador = creador;
	}

	public final RutinaEntity getRutina() {
		return rutinaEntity;
	}

	private final void setRutina(RutinaEntity rutinaEntity) {
		this.rutinaEntity = rutinaEntity;
	}

	public final DuracionEntity getDuracion() {
		return duracionEntity;
	}

	private final void setDuracion(DuracionEntity duracionEntity) {
		this.duracionEntity = duracionEntity;
	}
	
	

}
