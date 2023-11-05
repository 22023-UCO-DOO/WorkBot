package co.edu.uco.workbot.service.domain.miembro.support.correo;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public final class CorreoElectronicoMiembroDomain {
	private String correoElectronico;
	private boolean confirmacionCorreoElectronico;

	private CorreoElectronicoMiembroDomain(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
	setCorreoElectronico(correoElectronico);
	setConfirmacionCorreoElectronico(confirmacionCorreoElectronico);
	}
	
	public static final CorreoElectronicoMiembroDomain crear(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
		return new CorreoElectronicoMiembroDomain(correoElectronico, confirmacionCorreoElectronico);
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	private void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilTexto.aplicarTrim(correoElectronico);
	}

	public boolean isConfirmacionCorreoElectronico() {
		return confirmacionCorreoElectronico;
	}

	private void setConfirmacionCorreoElectronico(boolean confirmacionCorreoElectronico) {
		this.confirmacionCorreoElectronico = confirmacionCorreoElectronico;
	}
}