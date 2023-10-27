package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class PlanEntrenamientoDTO {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private EntrenadorDTO creador;
	private RutinaDTO rutinaDTO;
	private DuracionDTO duracionDTO;
	
	public PlanEntrenamientoDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setNombre(UtilTexto.VACIO);
		setDescripcion(UtilTexto.VACIO);
		setCreador(new EntrenadorDTO());
		setRutina(new RutinaDTO());
		setDuracion(new DuracionDTO());
	}
	
	public PlanEntrenamientoDTO(UUID id, String nombre, String descripcion, EntrenadorDTO creador, RutinaDTO rutinaDTO,
			DuracionDTO duracionDTO) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setCreador(creador);
		setRutina(rutinaDTO);
		setDuracion(duracionDTO);
	}
	
	public static final PlanEntrenamientoDTO crear(UUID id, String nombre, String descripcion, EntrenadorDTO creador, RutinaDTO rutinaDTO,
			DuracionDTO duracionDTO) { 
		return new PlanEntrenamientoDTO(id, nombre, descripcion, creador, rutinaDTO, duracionDTO);
					
		
	}

	public final UUID getId() {
		return id;
	}

	public final PlanEntrenamientoDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final PlanEntrenamientoDTO setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final PlanEntrenamientoDTO setDescripcion(String descripcion) {
		this.descripcion = UtilTexto.aplicarTrim(descripcion);return this;
	}

	public final EntrenadorDTO getCreador() {
		return creador;
	}

	public final PlanEntrenamientoDTO setCreador(EntrenadorDTO creador) {
		this.creador = creador;return this;
	}

	public final RutinaDTO getRutina() {
		return rutinaDTO;
	}

	public final PlanEntrenamientoDTO setRutina(RutinaDTO rutinaDTO) {
		this.rutinaDTO = rutinaDTO;return this;
	}

	public final DuracionDTO getDuracion() {
		return duracionDTO;
	}

	public final PlanEntrenamientoDTO setDuracion(DuracionDTO duracionDTO) {
		this.duracionDTO = duracionDTO;return this;
	}
	
	

}
