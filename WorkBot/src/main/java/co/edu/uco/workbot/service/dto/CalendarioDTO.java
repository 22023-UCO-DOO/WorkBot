package co.edu.uco.workbot.service.dto;


import java.util.Date;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilFechaUtil;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class CalendarioDTO {
	
	private UUID id;
private java.util.Date fecha;
	
	public CalendarioDTO(UUID id, Date fecha) {
		setId(id);
		setFecha(fecha);
	}

	public static final CalendarioDTO crear(UUID id,Date fecha) {
		return new CalendarioDTO(id,fecha);
	}
	
	private final CalendarioDTO setId(UUID id) {
		this.id =UtilUUID.obtenerUUIDDefecto(id);return this;
	}
	
	public final UUID getId() {
		return id;
	}

	public final Date getFecha() {
		return (fecha);
	}

	private final CalendarioDTO setFecha(Date fecha) {
		this.fecha = UtilFechaUtil.obtenerValorDefecto(fecha);return this;
	}

	
	
	
	

}
