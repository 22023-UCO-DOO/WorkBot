package co.edu.uco.workbot.service.domain.miembro.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.miembro.MiembroDomain;


public class MiembroValidationRule implements ValidationRule<MiembroDomain> {

	private static final ValidationRule<MiembroDomain> instancia = new MiembroValidationRule();

	public static final void ejecutarValidacion(final MiembroDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final MiembroDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
