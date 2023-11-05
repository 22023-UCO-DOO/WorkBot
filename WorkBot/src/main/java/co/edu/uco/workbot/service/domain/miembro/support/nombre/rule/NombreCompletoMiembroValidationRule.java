package co.edu.uco.workbot.service.domain.miembro.support.nombre.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.nombre.NombreCompletoMiembroDomain;

public class NombreCompletoMiembroValidationRule implements ValidationRule<NombreCompletoMiembroDomain> {

	private static final ValidationRule<NombreCompletoMiembroDomain> instancia = new NombreCompletoMiembroValidationRule();

	public static final void ejecutarValidacion(final NombreCompletoMiembroDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final NombreCompletoMiembroDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}

}
