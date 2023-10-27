package co.edu.uco.workbot.service.dto;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;



public final class TipoDocumentoDTO {
	private UUID id;
	private String nombre;

	public TipoDocumentoDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setNombre(UtilTexto.VACIO);
	}

	private TipoDocumentoDTO(final UUID id, final String nombre) {
		setId(id);
		setNombre(nombre);
		
	}

	public static final TipoDocumentoDTO crear(final UUID id, final String nombre) {
		return new TipoDocumentoDTO(id, nombre);
	}
	
	public final TipoDocumentoDTO setId(final UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final TipoDocumentoDTO setNombre(final String nombre) {
		this.nombre =UtilTexto.aplicarTrim(nombre);return this;
	}

	

	public final UUID getId() {
		return id;
	}

	public final String getNombre() {
		return nombre;
	}

	
}
