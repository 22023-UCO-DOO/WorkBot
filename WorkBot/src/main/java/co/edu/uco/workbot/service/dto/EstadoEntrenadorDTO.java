package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class EstadoEntrenadorDTO {

	private UUID id;
	private String nombre;
	
	public EstadoEntrenadorDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setNombre(UtilTexto.VACIO);
	}
	public EstadoEntrenadorDTO(UUID id, String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public static final EstadoEntrenadorDTO crear(UUID id, String nombre) {
	return new EstadoEntrenadorDTO(id, nombre);	
	}
	public final UUID getId() {
		return id;
	}
	private final EstadoEntrenadorDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}
	public final String getNombre() {
		return nombre;
	}
	private final EstadoEntrenadorDTO setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);return this;
	}
	
	
}
