package co.edu.uco.workbot.data.entity;

import java.util.UUID;



public final class TipoDocumento {
	private UUID id;
	private String nombre;


	private TipoDocumento(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
		
	}

	public static final TipoDocumento crear(final UUID id, final String nombre) {
		return new TipoDocumento(id, nombre);
	}
	
	private final void setId(final UUID id) {
		this.id = id;
	}

	private final void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	

	public final UUID getId() {
		return id;
	}

	public final String getNombre() {
		return nombre;
	}

	
}
