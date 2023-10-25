package co.edu.uco.workbot.service.domain.entrenador.support.datosentrenador;


import co.edu.uco.workbot.service.domain.estadoentrenador.EstadoEntrenadorDomain;
import co.edu.uco.workbot.service.domain.horario.HorarioDomain;

public final class EntrenadorDatosDomain {
	private HorarioDomain agendaInstructor;
	private EstadoEntrenadorDomain estado;

	private EntrenadorDatosDomain(HorarioDomain agendaInstructor, EstadoEntrenadorDomain estado) {
		setEstado(estado);
		setAgendaInstructor(agendaInstructor);
	}

	public static final EntrenadorDatosDomain crear(HorarioDomain agendaInstructor, EstadoEntrenadorDomain estado) {
		return new EntrenadorDatosDomain(agendaInstructor, estado);
	}

	public HorarioDomain getAgendaInstructor() {
		return agendaInstructor;
	}

	public void setAgendaInstructor(HorarioDomain agendaInstructor) {
		this.agendaInstructor = agendaInstructor;
	}

	public EstadoEntrenadorDomain getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntrenadorDomain estado) {
		this.estado = estado;
	}
}