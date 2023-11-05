package co.edu.uco.workbot.service.domain.estadoentrenador;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class EstadoEntrenadorDomain {

	private UUID id;
	private String nombre;
	public EstadoEntrenadorDomain(UUID id, String nombre) {
		setId(id);
		setNombre(nombre);
	}
	
	public static final EstadoEntrenadorDomain crear(UUID id, String nombre) {
	return new EstadoEntrenadorDomain(id, nombre);	
	}
	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(String nombre) {
		this.nombre = UtilTexto.aplicarTrim(nombre);
	}
	
	
}
