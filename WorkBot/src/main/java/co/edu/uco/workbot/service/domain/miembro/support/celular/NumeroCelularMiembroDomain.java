package co.edu.uco.workbot.service.domain.miembro.support.celular;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public class NumeroCelularMiembroDomain {
	private String numeroCelular;
	private boolean numeroCelularConfirmado;

	private NumeroCelularMiembroDomain(String numeroCelular, boolean numeroCelularConfirmado) {
		setNumeroCelular(numeroCelular);
		setNumeroCelularConfirmado(numeroCelularConfirmado);
	}
	
	public static final NumeroCelularMiembroDomain crear(String numeroCelular, boolean numeroCelularConfirmado) {
		return new NumeroCelularMiembroDomain(numeroCelular, numeroCelularConfirmado);
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilTexto.aplicarTrim(numeroCelular);
	}

	public boolean getNumeroCelularConfirmado() {
		return numeroCelularConfirmado;
	}

	public void setNumeroCelularConfirmado(boolean numeroCelularConfirmado) {
		this.numeroCelularConfirmado = numeroCelularConfirmado;
	}
}