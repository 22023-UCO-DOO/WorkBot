package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class SerieDTO {
	
	private UUID id;
	private DuracionDTO duracionDTO;
	private RepeticionDTO repeticionDTO;
	
	 public SerieDTO() {
		
	
		setId(UtilUUID.asignarUUIDPorDefecto());
		setDuracion(new DuracionDTO());
		setRepeticion(new RepeticionDTO());
	}
	
	public SerieDTO(UUID id, DuracionDTO duracionDTO, RepeticionDTO repeticionDTO) {
		setId(id);
		setDuracion(duracionDTO);
		setRepeticion(repeticionDTO);
	}
	
	public static final SerieDTO crear(UUID id, DuracionDTO duracionDTO, RepeticionDTO repeticionDTO) {
		return new SerieDTO(id, duracionDTO, repeticionDTO);
	}
	public final UUID getId() {
		return id;
	}
	public final SerieDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}
	public final DuracionDTO getDuracion() {
		return duracionDTO;
	}
	public final SerieDTO setDuracion(DuracionDTO duracionDTO) {
		this.duracionDTO = duracionDTO;return this;
	}
	public final RepeticionDTO getRepeticion() {
		return repeticionDTO;
	}
	public final SerieDTO setRepeticion(RepeticionDTO repeticionDTO) {
		this.repeticionDTO = repeticionDTO;return this;
	}
	
	

}
