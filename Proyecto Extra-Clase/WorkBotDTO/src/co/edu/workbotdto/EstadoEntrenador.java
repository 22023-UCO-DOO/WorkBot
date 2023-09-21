package co.edu.workbotdto;

import java.util.UUID;

import co.edu.uco.transformate.crosscutting.utils.UtilText;
import co.edu.uco.transformate.crosscutting.utils.UtilUUID;

public class EstadoEntrenador {
	
	private UUID id;
	private String nombre;
	private String descripcion;
	
	public EstadoEntrenador(UUID id, String nombre, String descripcion) {
		
		
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public EstadoEntrenador() {
		setId(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	public static EstadoEntrenador create() {
		return new EstadoEntrenador();
	}

	public UUID getId() {
		return id;
	}

	public EstadoEntrenador setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public EstadoEntrenador setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public EstadoEntrenador setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	
}
