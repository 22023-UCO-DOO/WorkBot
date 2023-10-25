package co.edu.uco.workbot.service.domain.horario;

import java.util.UUID;

import co.edu.uco.workbot.crosscutting.util.UtilTiempo;
import co.edu.uco.workbot.crosscutting.util.UtilUUID;
import co.edu.uco.workbot.service.domain.calendario.CalendarioDomain;

public class HorarioDomain {
	
	private UUID id;
	private int horaInicio;
	private int horaFinalizacion;
	private CalendarioDomain calendario;
	
	public HorarioDomain(UUID id, int horaInicio, int horaFinalizacion,CalendarioDomain calendario) {
		
		setId(id);
		setHoraInicio(horaInicio);
		setHoraFinalizacion(horaFinalizacion);
	setCalendario(calendario);
	}

	public static final HorarioDomain crear(UUID id, int horaInicio, int horaFinalizacion,CalendarioDomain calendario) {
		return new HorarioDomain(id, horaInicio, horaFinalizacion,calendario);
	}
	
	public final UUID getId() {
		return id;
	}

	public final int getHoraInicio() {
		return horaInicio;
	}

	public final int getHoraFinalizacion() {
		return horaFinalizacion;
	}

	private final void setId(UUID id) {
		this.id = UtilUUID.obtenerUUIDDefecto(id);
	}

	private final void setHoraInicio(int horaInicio) {
		this.horaInicio = UtilTiempo.obtenerValorDefectoHora(horaInicio);
	}

	private final void setHoraFinalizacion(int horaFinalizacion) {
		this.horaFinalizacion =UtilTiempo.obtenerValorDefectoHora(horaFinalizacion);
	}

	public final CalendarioDomain getCalendario() {
		return calendario;
	}

	private final void setCalendario(CalendarioDomain calendario) {
		this.calendario = calendario;
	}
	
	
	
	

}
