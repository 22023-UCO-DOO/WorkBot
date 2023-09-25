package co.edu.uco.workbot.data.entity;


import java.util.UUID;

public class Repeticion {
	
	private UUID id;
	private int cantidad;
	
	public Repeticion(UUID id, int cantidad) {
		setId(id);
	setCantidad(cantidad);
		
	}
	
	public static final Repeticion crear(UUID id, int cantidad) {
		return new Repeticion(id, cantidad);
	}

	public final UUID getId() {
		return id;
	}
	private final void setId(UUID id) {
		this.id = id;
	}

	public final int getCantidad() {
		return cantidad;
	}

	private final void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	


}
