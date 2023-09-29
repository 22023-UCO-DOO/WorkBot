package co.edu.uco.workbot.data.entity.support;

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
		this.nombre = nombre;
	}

	public final String getApellido() {
		return apellido;
	}

	private final void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	

	



}