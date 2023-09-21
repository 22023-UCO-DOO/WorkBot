package co.edu.workbotdto;

import java.util.UUID;

import co.edu.uco.transformate.crosscutting.utils.UtilText;
import co.edu.uco.transformate.crosscutting.utils.UtilUUID;


public class EstadoEjercicioDTO {

	private UUID id;
	private String nombre;
	private String descripcion;
	
	public EstadoEjercicioDTO(UUID id, String nombre, String descripcion) {
		
		
		setId(id);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public EstadoEjercicioDTO() {
		setId(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	public static EstadoEjercicioDTO create() {
		return new EstadoEjercicioDTO();
	}

	public UUID getId() {
		return id;
	}

	public EstadoEjercicioDTO setId(UUID id) {
		this.id = UtilUUID.getDefault(id);
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public EstadoEjercicioDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public EstadoEjercicioDTO setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

}
