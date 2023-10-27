package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class EjercicioDTO {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	private SerieDTO serieDTO;
	
	public EjercicioDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setNombre(UtilTexto.VACIO);
		setDescripcion(UtilTexto.VACIO);
		setSerie(new SerieDTO());
	}
	
	
	public EjercicioDTO(UUID id, String nombre, String descripcion, SerieDTO serieDTO) {
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
		setSerie(serieDTO);
	}
	
	public static final EjercicioDTO crear(UUID id, String nombre, String descripcion, SerieDTO serieDTO) {
		return new EjercicioDTO(id, nombre, descripcion, serieDTO);
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
	public final SerieDTO getSerie() {
		return serieDTO;
	}
	public final EjercicioDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}
	public final EjercicioDTO setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);return this;
	}
	public final EjercicioDTO setDescripcion(String descripcion) {
		this.descripcion = UtilTexto.aplicarTrim(descripcion);return this;
	}
	public final EjercicioDTO setSerie(SerieDTO serieDTO) {
		this.serieDTO = serieDTO;return this;
	}
	
	

}
