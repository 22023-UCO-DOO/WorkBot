package co.edu.uco.workbot.data.entity;

import co.edu.uco.workbot.data.entity.support.EntrenadorDatosEntity;

public class EntrenadorEntity {
	
	private MiembroEntity miembro;
	private EntrenadorDatosEntity datosEntrenador;




	public EntrenadorEntity(MiembroEntity miembro,EntrenadorDatosEntity datosEntrenador) {
		setMiembro(miembro);
		setDatosEntrenador(datosEntrenador);
		
	}

	public static final EntrenadorEntity crear(MiembroEntity miembro,EntrenadorDatosEntity datosEntrenador) {
		
		return new EntrenadorEntity(miembro, datosEntrenador);
	}

	public final EntrenadorDatosEntity getDatosEntrenador() {
		return datosEntrenador;
	}

	private final void setDatosEntrenador(EntrenadorDatosEntity datosEntrenador) {
		this.datosEntrenador = datosEntrenador;
	}

	public final MiembroEntity getMiembro() {
		return miembro;
	}

	private final void setMiembro(MiembroEntity miembro) {
		this.miembro = miembro;
	}
	
	


	
	

}
