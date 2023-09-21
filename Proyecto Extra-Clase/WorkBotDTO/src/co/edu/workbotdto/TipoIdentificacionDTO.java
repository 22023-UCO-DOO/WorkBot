package co.edu.workbotdto;

import java.util.UUID;

import co.edu.uco.transformate.crosscutting.utils.UtilText;
import co.edu.uco.transformate.crosscutting.utils.UtilUUID;

public class TipoIdentificacionDTO {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	
	public TipoIdentificacionDTO(UUID id, String nombre, String descripcion) {
		
		
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public TipoIdentificacionDTO() {
		setId(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	public static TipoIdentificacionDTO create() {
		return new TipoIdentificacionDTO();
	}

	public UUID getId() {
		return id;
	}

	public TipoIdentificacionDTO setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public TipoIdentificacionDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public TipoIdentificacionDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	
}
