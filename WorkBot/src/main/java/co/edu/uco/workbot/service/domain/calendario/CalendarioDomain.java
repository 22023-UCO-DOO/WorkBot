package co.edu.uco.workbot.service.domain.calendario;


import java.sql.Date;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilFecha;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;

public class CalendarioDomain {
	
	private UUID id;
private Date fecha;
	
	public CalendarioDomain(UUID id, Date fecha) {
		setId(id);
		setFecha(fecha);
	}

	public static final CalendarioDomain crear(UUID id,Date fecha) {
		return new CalendarioDomain(id,fecha);
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
