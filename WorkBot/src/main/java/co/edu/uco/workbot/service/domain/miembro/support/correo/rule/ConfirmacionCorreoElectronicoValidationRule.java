package co.edu.uco.workbot.service.domain.miembro.support.correo.rule;

import java.sql.Date;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilFecha;
import co.edu.uco.workbot.service.domain.ValidationRule;



public class ConfirmacionCorreoElectronicoValidationRule implements ValidationRule<Boolean>//implements ValidationRule<boolean> {
{
	private static final ValidationRule<Boolean> instancia = new ConfirmacionCorreoElectronicoValidationRule();
	public static final void ejecutarValidacion(final Boolean dato) {
		instancia.validator(dato);
	}
	
	@Override
	public final void validator(final Boolean dato) {
		
		validarObligatoriedad(dato);
		

	}

	

	private final void validarObligatoriedad(final Boolean dato) {
		
		if(dato.equals( extracted())) {
			throw ServiceWorkBotException.crear("El validar el correo electronico es obligatorio...");
			
		}
	}

	private Date extracted() {
		return UtilFecha.asignarPorDefecto();
	}

}
