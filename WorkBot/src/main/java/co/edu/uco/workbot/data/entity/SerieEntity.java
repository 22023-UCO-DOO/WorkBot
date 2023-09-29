package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class SerieEntity {
	
	private UUID id;
	private DuracionEntity duracionEntity;
	private RepeticionEntity repeticionEntity;
	public SerieEntity(UUID id, DuracionEntity duracionEntity, RepeticionEntity repeticionEntity) {
		setId(id);
		setDuracion(duracionEntity);
		setRepeticion(repeticionEntity);
	}
	
	public static final SerieEntity crear(UUID id, DuracionEntity duracionEntity, RepeticionEntity repeticionEntity) {
		return new SerieEntity(id, duracionEntity, repeticionEntity);
	}
	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = id;
	}
	public final DuracionEntity getDuracion() {
		return duracionEntity;
	}
	private final void setDuracion(DuracionEntity duracionEntity) {
		this.duracionEntity = duracionEntity;
	}
	public final RepeticionEntity getRepeticion() {
		return repeticionEntity;
	}
	private final void setRepeticion(RepeticionEntity repeticionEntity) {
		this.repeticionEntity = repeticionEntity;
	}
	
	

}
