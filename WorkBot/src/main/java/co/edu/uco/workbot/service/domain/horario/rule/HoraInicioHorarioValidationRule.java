package co.edu.uco.workbot.service.domain.horario.rule;




import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;

import co.edu.uco.workbot.crosscutting.util.UtilNumero;
import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.service.domain.ValidationRule;

public class HoraInicioHorarioValidationRule implements ValidationRule<Integer> {

	private static final ValidationRule<Integer> instancia = new HoraInicioHorarioValidationRule();
	public static final void ejecutarValidacion(final Integer i) {
		instancia.validator(i);
	}
	
	@Override
	public final void validator(final Integer dato) {

		validarObligatoriedad(dato);
		validarFormato(dato.toString());

	}

	

	private final void validarObligatoriedad(final Integer dato) {
		if(UtilNumero.estaNulo(dato)) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación es un dato obligatorio...");
			
		}
	}

	private final void validarFormato(final String dato) {
		if((UtilTexto.contieneSoloNumeros(dato))) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación solo puede contener letras...");
			
		}
	}

}
