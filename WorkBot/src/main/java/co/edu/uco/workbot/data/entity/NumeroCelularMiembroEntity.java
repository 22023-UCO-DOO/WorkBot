package co.edu.uco.workbot.data.entity;

public class NumeroCelularMiembroEntity {
	private String numeroCelular;
	private boolean numeroCelularConfirmado;

	private NumeroCelularMiembroEntity(String numeroCelular, boolean numeroCelularConfirmado) {
		setNumeroCelular(numeroCelular);
		setNumeroCelularConfirmado(numeroCelularConfirmado);
	}
	
	public static final NumeroCelularMiembroEntity crear(String numeroCelular, boolean numeroCelularConfirmado) {
		return new NumeroCelularMiembroEntity(numeroCelular, numeroCelularConfirmado);
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public boolean getNumeroCelularConfirmado() {
		return numeroCelularConfirmado;
	}

	public void setNumeroCelularConfirmado(boolean numeroCelularConfirmado) {
		this.numeroCelularConfirmado = numeroCelularConfirmado;
	}
}