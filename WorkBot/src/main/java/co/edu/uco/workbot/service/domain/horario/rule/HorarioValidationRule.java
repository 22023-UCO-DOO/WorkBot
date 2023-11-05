package co.edu.uco.workbot.service.domain.horario.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.horario.HorarioDomain;


public class HorarioValidationRule implements ValidationRule<HorarioDomain> {

	private static final ValidationRule<HorarioDomain> instancia = new HorarioValidationRule();

	public static final void ejecutarValidacion(final HorarioDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final HorarioDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}

}