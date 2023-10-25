package co.edu.uco.workbot.service.domain.horario.rule;

import java.sql.Date;


import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilFecha;


import co.edu.uco.workbot.service.domain.ValidationRule;

public class HoraFinalizacionHorarioValidationRule implements ValidationRule<Date> {

	private static final ValidationRule<Date> instancia = new HoraFinalizacionHorarioValidationRule();
	public static final void ejecutarValidacion(final Date dato) {
		instancia.validator(dato);
	}
	
	@Override
	public final void validator(final Date dato) {

		validarObligatoriedad(dato);
		validarFormato(dato);

	}

	

	private final void validarObligatoriedad(final Date dato) {
		if(UtilFecha.estaNulo(dato)) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación es un dato obligatorio...");
			
		}
	}

	private final void validarFormato(final Date dato) {
		if(dato.equals(UtilFecha.FECHA_POR_DEFECTO_TEXTO)) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación solo puede contener letras...");
			
		}
	}

}
