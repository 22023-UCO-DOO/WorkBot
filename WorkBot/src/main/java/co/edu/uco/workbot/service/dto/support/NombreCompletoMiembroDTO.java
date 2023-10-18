package co.edu.uco.workbot.service.dto.support;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class NombreCompletoMiembroDTO {
	private String nombre;
	
	private String apellido;
	
	public NombreCompletoMiembroDTO() {
		setNombre(UtilTexto.VACIO);
		setApellido(UtilTexto.VACIO);
	}
	private NombreCompletoMiembroDTO(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public static final NombreCompletoMiembroDTO crear(String nombre, String apellido) {
		return new NombreCompletoMiembroDTO(nombre, apellido);
	}

	public final String getNombre() {
		return nombre;
	}

	private final NombreCompletoMiembroDTO setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);return this;
	}

	public final String getApellido() {
		return apellido;
	}

	private final NombreCompletoMiembroDTO setApellido(String apellido) {
		this.apellido = UtilTexto.aplicarTrim(apellido);return this;
	}
	
	
	
	

	



}