package co.edu.uco.workbot.service.dto.support;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class CorreoElectronicoMiembroDTO {
	private String correoElectronico;
	private boolean confirmacionCorreoElectronico;
	
	public CorreoElectronicoMiembroDTO() {
		setCorreoElectronico(UtilTexto.VACIO);
		setConfirmacionCorreoElectronico(false);
	}

	private CorreoElectronicoMiembroDTO(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
	setCorreoElectronico(correoElectronico);
	setConfirmacionCorreoElectronico(confirmacionCorreoElectronico);
	}
	
	public static final CorreoElectronicoMiembroDTO crear(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
		return new CorreoElectronicoMiembroDTO(correoElectronico, confirmacionCorreoElectronico);
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public CorreoElectronicoMiembroDTO setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilTexto.aplicarTrim(correoElectronico);return this;
	}

	public boolean isConfirmacionCorreoElectronico() {
		return confirmacionCorreoElectronico;
	}

	public CorreoElectronicoMiembroDTO setConfirmacionCorreoElectronico(boolean confirmacionCorreoElectronico) {
		this.confirmacionCorreoElectronico = confirmacionCorreoElectronico;return this;
	}
}