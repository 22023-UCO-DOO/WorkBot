package co.edu.uco.workbot.service.dto;


import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilNumero;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class RepeticionDTO {
	
	private UUID id;
	private int cantidad;
	
	public RepeticionDTO() {
		setId(UtilUUID.asignarUUIDPorDefecto());
		setCantidad(UtilNumero.ZERO);
	}
	
	public RepeticionDTO(UUID id, int cantidad) {
		setId(id);
	setCantidad(cantidad);
		
	}
	
	public static final RepeticionDTO crear(UUID id, int cantidad) {
		return new RepeticionDTO(id, cantidad);
	}

	public final UUID getId() {
		return id;
	}
	public final RepeticionDTO setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);return this;
	}

	public final int getCantidad() {
		return cantidad;
	}

	public final RepeticionDTO setCantidad(int cantidad) {
		this.cantidad = (int) UtilNumero.obtenerNumeroDefecto(cantidad);return this;
	}
	


}
