package co.edu.uco.workbot.data.entity;


import java.sql.Date;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilFecha;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class CalendarioEntity {
	
	private UUID id;
private Date fecha;
	
	public CalendarioEntity(UUID id, Date fecha) {
		setId(id);
		setFecha(fecha);
	}

	public static final CalendarioEntity crear(UUID id,Date fecha) {
		return new CalendarioEntity(id,fecha);
	}
	
	private final void setId(UUID id) {
		this.id =UtilUUID.obtenerUUIDDefecto(id);
	}
	
	public final UUID getId() {
		return id;
	}

	public final Date getFecha() {
		return (fecha);
	}

	private final void setFecha(Date fecha) {
		this.fecha = UtilFecha.obtenerValorDefecto(fecha);
	}

	
	
	
	

}
