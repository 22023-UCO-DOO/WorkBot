package co.edu.uco.workbot.service.domain.entrenador.support.datosentrenador.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;

import co.edu.uco.workbot.service.domain.entrenador.support.datosentrenador.EntrenadorDatosDomain;

public class EntrenadorDatosValidationRule implements ValidationRule<EntrenadorDatosDomain> {

	private static final ValidationRule<EntrenadorDatosDomain> instancia = new EntrenadorDatosValidationRule();

	public static final void ejecutarValidacion(final EntrenadorDatosDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final EntrenadorDatosDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Calendario, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
