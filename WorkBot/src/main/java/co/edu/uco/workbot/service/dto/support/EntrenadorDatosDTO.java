package co.edu.uco.workbot.service.dto.support;


import co.edu.uco.workbot.service.dto.EstadoEntrenadorDTO;
import co.edu.uco.workbot.service.dto.HorarioDTO;

public final class EntrenadorDatosDTO {
	private HorarioDTO agendaInstructor;
	private EstadoEntrenadorDTO estado;
	
	public EntrenadorDatosDTO() {
		setAgendaInstructor(new HorarioDTO());
		setEstado(new EstadoEntrenadorDTO());
	}

	private EntrenadorDatosDTO(HorarioDTO agendaInstructor, EstadoEntrenadorDTO estado) {
		setEstado(estado);
		setAgendaInstructor(agendaInstructor);
	}

	public static final EntrenadorDatosDTO crear(HorarioDTO agendaInstructor, EstadoEntrenadorDTO estado) {
		return new EntrenadorDatosDTO(agendaInstructor, estado);
	}

	public HorarioDTO getAgendaInstructor() {
		return agendaInstructor;
	}

	public EntrenadorDatosDTO setAgendaInstructor(HorarioDTO agendaInstructor) {
		this.agendaInstructor = agendaInstructor;return this;
	}

	public EstadoEntrenadorDTO getEstado() {
		return estado;
	}

	public EntrenadorDatosDTO setEstado(EstadoEntrenadorDTO estado) {
		this.estado = estado;return this;
	}
}