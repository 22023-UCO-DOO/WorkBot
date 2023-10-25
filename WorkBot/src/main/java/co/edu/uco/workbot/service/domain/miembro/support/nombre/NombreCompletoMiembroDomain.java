package co.edu.uco.workbot.service.domain.miembro.support.nombre;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class NombreCompletoMiembroDomain {
	private String nombre;
	
	private String apellido;

	private NombreCompletoMiembroDomain(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public static final NombreCompletoMiembroDomain crear(String nombre, String apellido) {
		return new NombreCompletoMiembroDomain(nombre, apellido);
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