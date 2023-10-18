package co.edu.uco.workbot.service.dto.support;

import co.edu.uco.workbot.crosscutting.util.UtilTexto;

public class NumeroCelularMiembroDTO {
	private String numeroCelular;
	private boolean numeroCelularConfirmado;

	public NumeroCelularMiembroDTO() {
		setNumeroCelular(UtilTexto.VACIO);
		setNumeroCelularConfirmado(false);
	}
	
	private NumeroCelularMiembroDTO(String numeroCelular, boolean numeroCelularConfirmado) {
		setNumeroCelular(numeroCelular);
		setNumeroCelularConfirmado(numeroCelularConfirmado);
	}
	
	public static final NumeroCelularMiembroDTO crear(String numeroCelular, boolean numeroCelularConfirmado) {
		return new NumeroCelularMiembroDTO(numeroCelular, numeroCelularConfirmado);
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public NumeroCelularMiembroDTO setNumeroCelular(String numeroCelular) {
		this.numeroCelular = UtilTexto.aplicarTrim(numeroCelular);return this;
	}

	public boolean getNumeroCelularConfirmado() {
		return numeroCelularConfirmado;
	}

	public NumeroCelularMiembroDTO setNumeroCelularConfirmado(boolean numeroCelularConfirmado) {
		this.numeroCelularConfirmado = numeroCelularConfirmado;return this;
	}
}