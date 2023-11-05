package co.edu.uco.workbot.service.domain.entrenador;


import co.edu.uco.workbot.service.domain.entrenador.support.datosentrenador.EntrenadorDatosDomain;
import co.edu.uco.workbot.service.domain.miembro.MiembroDomain;

public class EntrenadorDomain {
	
	private MiembroDomain miembro;
	private EntrenadorDatosDomain datosEntrenador;




	public EntrenadorDomain(MiembroDomain miembro,EntrenadorDatosDomain datosEntrenador) {
		setMiembro(miembro);
		setDatosEntrenador(datosEntrenador);
		
	}

	public static final EntrenadorDomain crear(MiembroDomain miembro,EntrenadorDatosDomain datosEntrenador) {
		
		return new EntrenadorDomain(miembro, datosEntrenador);
	}

	public final EntrenadorDatosDomain getDatosEntrenador() {
		return datosEntrenador;
	}

	private final void setDatosEntrenador(EntrenadorDatosDomain datosEntrenador) {
		this.datosEntrenador = datosEntrenador;
	}

	public final MiembroDomain getMiembro() {
		return miembro;
	}

	private final void setMiembro(MiembroDomain miembro) {
		this.miembro = miembro;
	}
	
	


	
	

}
