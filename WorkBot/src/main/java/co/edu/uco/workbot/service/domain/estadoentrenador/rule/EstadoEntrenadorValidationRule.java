package co.edu.uco.workbot.service.domain.estadoentrenador.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.estadoentrenador.EstadoEntrenadorDomain;

public class EstadoEntrenadorValidationRule implements ValidationRule<EstadoEntrenadorDomain> {

	private static final ValidationRule<EstadoEntrenadorDomain> instancia = new EstadoEntrenadorValidationRule();

	public static final void ejecutarValidacion(final EstadoEntrenadorDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final EstadoEntrenadorDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
