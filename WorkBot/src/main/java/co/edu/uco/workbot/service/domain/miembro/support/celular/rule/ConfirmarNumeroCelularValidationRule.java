package co.edu.uco.workbot.service.domain.miembro.support.celular.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;

import co.edu.uco.workbot.service.domain.ValidationRule;


public class ConfirmarNumeroCelularValidationRule implements ValidationRule<Boolean> 
{
	private static final ValidationRule<Boolean> instancia = new ConfirmarNumeroCelularValidationRule();
	public static final void ejecutarValidacion(final Boolean dato) {
		instancia.validator(dato);
	}
	
	@Override
	public final void validator(final Boolean dato) {
		
		validarObligatoriedad(dato);
		

	}

	

	private final void validarObligatoriedad(final Boolean dato) {
		if(dato.equals(false)) {
			throw ServiceWorkBotException.crear("El validar el correo electronico es obligatorio...");
			
		}
	}
}
