package co.edu.uco.workbot.service.domain.miembro.support.celular.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.celular.NumeroCelularMiembroDomain;
public class NumeroCelularClienteValidationRule implements ValidationRule<NumeroCelularMiembroDomain> {

	private static final ValidationRule<NumeroCelularMiembroDomain> instancia = new NumeroCelularClienteValidationRule();

	public static final void ejecutarValidacion(final NumeroCelularMiembroDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final NumeroCelularMiembroDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
