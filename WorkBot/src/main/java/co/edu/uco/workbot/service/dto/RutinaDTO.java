package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class RutinaDTO {

	private UUID id;
	private String nombre;
	private String descripcion;
	private EjercicioDTO ejercicioDTO;
	
	public RutinaDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setNombre(UtilTexto.VACIO);
		setDescripcion(UtilTexto.VACIO);
		setEjercicio(new EjercicioDTO());
	}

	public RutinaDTO(UUID id, String nombre, String descripcion, EjercicioDTO ejercicioDTO) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEjercicio(ejercicioDTO);
	}
	
	public static final RutinaDTO create(UUID id, String nombre, String descripcion, EjercicioDTO ejercicioDTO) {
		return new RutinaDTO(id, nombre, descripcion, ejercicioDTO);
	}

	public final UUID getId() {
		return id;
	}

	public final RutinaDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final RutinaDTO setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilTexto.aplicarTrim(descripcion);
	}

	public final EjercicioDTO getEjercicio() {
		return ejercicioDTO;
	}

	private final void setEjercicio(EjercicioDTO ejercicioDTO) {
		this.ejercicioDTO = ejercicioDTO;
	}

}
