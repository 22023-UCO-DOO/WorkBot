package co.edu.uco.workbot.service.domain.calendario.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.calendario.CalendarioDomain;


public class CalendarioValidationRule implements ValidationRule<CalendarioDomain> {

	private static final ValidationRule<CalendarioDomain> instancia = new CalendarioValidationRule();

	public static final void ejecutarValidacion(final CalendarioDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final CalendarioDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Calendario, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}

}