package co.edu.uco.workbot.service.domain.miembro.support.correo.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilObjeto;
import co.edu.uco.workbot.service.domain.ValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.correo.CorreoElectronicoMiembroDomain;

public class CorreoElectronicoValidationRule  implements ValidationRule<CorreoElectronicoMiembroDomain> {

	private static final ValidationRule<CorreoElectronicoMiembroDomain> instancia = new CorreoElectronicoValidationRule();

	public static final void ejecutarValidacion(final CorreoElectronicoMiembroDomain data) {
		instancia.validator(data);
	}

	@Override
	public final void validator(final CorreoElectronicoMiembroDomain dato) {

		if (UtilObjeto.esNulo(dato)) {
			throw ServiceWorkBotException.crear(
					"No es pisble llevar a cabo la operacion deseada con el Tipo de Identificacion, ya que no existen datos paa lleva a cabo la operacion deseada...");
		}
	}
}
