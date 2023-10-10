package co.edu.uco.workbot.data.entity;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;



public final class TipoDocumentoEntity {
	private UUID id;
	private String nombre;


	private TipoDocumentoEntity(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
		
	}

	public static final TipoDocumentoEntity crear(final UUID id, final String nombre) {
		return new TipoDocumentoEntity(id, nombre);
	}
	
	private final void setId(final UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	private final void setNombre(final String nombre) {
		this.nombre =UtilTexto.aplicarTrim(nombre);
	}

	

	public final UUID getId() {
		return id;
	}

	public final String getNombre() {
		return nombre;
	}

	
}
