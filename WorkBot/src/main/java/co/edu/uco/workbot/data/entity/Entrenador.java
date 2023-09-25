package co.edu.uco.workbot.data.entity;

import java.util.UUID;

public class Entrenador extends Miembro{
	
	private Horario agendaInstructor;
	private EstadoEntrenador estado;

	public Entrenador(UUID id, TipoDocumento tipoDocumento, String identificacion, String nombre, String apellido,
			String correo,Horario agendaInstructor,EstadoEntrenador estado) {
		super(id, tipoDocumento, identificacion, nombre, apellido, correo);
		setAgendaInstructor(agendaInstructor);
		setEstado(estado);
	}
	
	public static final Entrenador crear(UUID id, TipoDocumento tipoDocumento, String identificacion, String nombre, String apellido,
			String correo,Horario agendaInstructor,EstadoEntrenador estado) {
		return new Entrenador(id, tipoDocumento, identificacion, nombre, apellido, correo, agendaInstructor,estado);
	}

	public final EstadoEntrenador getEstado() {
		return estado;
	}

	private final void setEstado(EstadoEntrenador estado) {
		this.estado = estado;
	}

	public final Horario getAgendaInstructor() {
		return agendaInstructor;
	}

	private final void setAgendaInstructor(Horario agendaInstructor) {
		this.agendaInstructor = agendaInstructor;
	}
	
	

}
