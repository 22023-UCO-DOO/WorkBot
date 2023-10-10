package co.edu.uco.workbot.data.entity.support;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class NombreCompletoMiembroEntity {
	private String nombre;
	
	private String apellido;

	private NombreCompletoMiembroEntity(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public static final NombreCompletoMiembroEntity crear(String nombre, String apellido) {
		return new NombreCompletoMiembroEntity(nombre, apellido);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);
	}

	public final String getApellido() {
		return apellido;
	}

	private final void setApellido(String apellido) {
		this.apellido = UtilTexto.aplicarTrim(apellido);
	}
	
	
	
	

	



}