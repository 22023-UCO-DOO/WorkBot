package co.edu.uco.workbot.service.domain.calendario.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.tipodocumento.TipoDocumentoDomain;

public class CalendarioValidationRule implements ValidationRule<TipoDocumentoDomain> {

	private static final ValidationRule<TipoDocumentoDomain> instancia = new CalendarioValidationRule();

	public static final void ejecutarValidacion(final TipoDocumentoDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final TipoDocumentoDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}

}