package co.edu.uco.workbot.service.domain.entrenador.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;

import co.edu.uco.workbot.service.domain.entrenador.EntrenadorDomain;

public class EntrenadorValidationRule implements ValidationRule<EntrenadorDomain> {

	private static final ValidationRule<EntrenadorDomain> instancia = new EntrenadorValidationRule();

	public static final void ejecutarValidacion(final EntrenadorDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final EntrenadorDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Calendario, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
