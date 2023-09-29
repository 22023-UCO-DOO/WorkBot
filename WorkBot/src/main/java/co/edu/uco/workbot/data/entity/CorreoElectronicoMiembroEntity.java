package co.edu.uco.workbot.data.entity;

public final class CorreoElectronicoMiembroEntity {
	private String correoElectronico;
	private boolean confirmacionCorreoElectronico;

	private CorreoElectronicoMiembroEntity(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
	setCorreoElectronico(correoElectronico);
	setConfirmacionCorreoElectronico(confirmacionCorreoElectronico);
	}
	
	public static final CorreoElectronicoMiembroEntity crear(final String correoElectronico,final boolean confirmacionCorreoElectronico) {
		return new CorreoElectronicoMiembroEntity(correoElectronico, confirmacionCorreoElectronico);
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	private void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public boolean isConfirmacionCorreoElectronico() {
		return confirmacionCorreoElectronico;
	}

	private void setConfirmacionCorreoElectronico(boolean confirmacionCorreoElectronico) {
		this.confirmacionCorreoElectronico = confirmacionCorreoElectronico;
	}
}