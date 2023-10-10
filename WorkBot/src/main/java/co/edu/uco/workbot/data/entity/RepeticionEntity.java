package co.edu.uco.workbot.data.entity;


import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class RepeticionEntity {
	
	private UUID id;
	private int cantidad;
	
	public RepeticionEntity(UUID id, int cantidad) {
		setId(id);
	setCantidad(cantidad);
		
	}
	
	public static final RepeticionEntity crear(UUID id, int cantidad) {
		return new RepeticionEntity(id, cantidad);
	}

	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	public final int getCantidad() {
		return cantidad;
	}

	private final void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}
