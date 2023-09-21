package co.edu.workbotdto;

import java.util.UUID;

import co.edu.uco.transformate.crosscutting.utils.UtilText;
import co.edu.uco.transformate.crosscutting.utils.UtilUUID;

public class EquipoMantenimientoDTO {
	private UUID id;
	private String nombre;
	private String descripcion;
	
	public EquipoMantenimientoDTO(UUID id, String nombre, String descripcion) {
		
		
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public EquipoMantenimientoDTO() {
		setId(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	public static EquipoMantenimientoDTO create() {
		return new EquipoMantenimientoDTO();
	}

	public UUID getId() {
		return id;
	}

	public EquipoMantenimientoDTO setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public EquipoMantenimientoDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public EquipoMantenimientoDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
}
