package co.edu.uco.workbot.data.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Horario {
	
	private UUID id;
	private LocalDateTime horaInicio;
	private LocalDateTime horaFinalizacion;
	
	public Horario(UUID id, LocalDateTime horaInicio, LocalDateTime horaFinalizacion) {
		
		setId(id);
		setHoraInicio(horaInicio);
		setHoraFinalizacion(horaFinalizacion);
	
	}

	public static final Horario crear(UUID id, LocalDateTime horaInicio, LocalDateTime horaFinalizacion) {
		return new Horario(id, horaInicio, horaFinalizacion);
	}
	
	public final UUID getId() {
		return id;
	}

	public final LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public final LocalDateTime getHoraFinalizacion() {
		return horaFinalizacion;
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	private final void setHoraFinalizacion(LocalDateTime horaFinalizacion) {
		this.horaFinalizacion = horaFinalizacion;
	}
	
	

}
