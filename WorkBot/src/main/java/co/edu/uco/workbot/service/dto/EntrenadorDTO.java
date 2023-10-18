package co.edu.uco.workbot.service.dto;


import co.edu.uco.workbot.service.dto.support.EntrenadorDatosDTO;

public class EntrenadorDTO {
	
	private MiembroDTO miembro;
	private EntrenadorDatosDTO datosEntrenador;

	public EntrenadorDTO() {
		setMiembro(new MiembroDTO());
		setDatosEntrenador(new EntrenadorDatosDTO());
	}


	public EntrenadorDTO(MiembroDTO miembro,EntrenadorDatosDTO datosEntrenador) {
		setMiembro(miembro);
		setDatosEntrenador(datosEntrenador);
		
	}

	public static final EntrenadorDTO crear(MiembroDTO miembro,EntrenadorDatosDTO datosEntrenador) {
		
		return new EntrenadorDTO(miembro, datosEntrenador);
	}

	public final EntrenadorDatosDTO getDatosEntrenador() {
		return datosEntrenador;
	}

	private final EntrenadorDTO setDatosEntrenador(EntrenadorDatosDTO datosEntrenador) {
		this.datosEntrenador = datosEntrenador;return this;
	}

	public final MiembroDTO getMiembro() {
		return miembro;
	}

	private final EntrenadorDTO setMiembro(MiembroDTO miembro) {
		this.miembro = miembro;return this;
	}
	
	


	
	

}
