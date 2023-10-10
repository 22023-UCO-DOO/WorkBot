package co.edu.uco.workbot.data.entity;

public final class EntrenadorDatosEntity {
	private HorarioEntity agendaInstructor;
	private EstadoEntrenadorEntity estado;

	private EntrenadorDatosEntity(HorarioEntity agendaInstructor, EstadoEntrenadorEntity estado) {
		setEstado(estado);
		setAgendaInstructor(agendaInstructor);
	}

	public static final EntrenadorDatosEntity crear(HorarioEntity agendaInstructor, EstadoEntrenadorEntity estado) {
		return new EntrenadorDatosEntity(agendaInstructor, estado);
	}

	public HorarioEntity getAgendaInstructor() {
		return agendaInstructor;
	}

	public void setAgendaInstructor(HorarioEntity agendaInstructor) {
		this.agendaInstructor = agendaInstructor;
	}

	public EstadoEntrenadorEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntrenadorEntity estado) {
		this.estado = estado;
	}
}