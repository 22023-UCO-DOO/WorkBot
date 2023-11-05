package co.edu.uco.workbot.service.businesslogic.validator.concrete.miembro;

import co.edu.uco.workbot.service.businesslogic.validator.Validator;
import co.edu.uco.workbot.service.domain.miembro.MiembroDomain;
import co.edu.uco.workbot.service.domain.miembro.rule.IdMiembroValidationRule;
import co.edu.uco.workbot.service.domain.miembro.rule.MiembroValidationRule;

public class EliminarMiembroValidator implements Validator<MiembroDomain>{

	private static final Validator<MiembroDomain> instancia = new EliminarMiembroValidator();
	private EliminarMiembroValidator() {
		
	}
	
	public static final void ejecutarValidacion(final MiembroDomain dato) {
		instancia.execute(dato);
	}
	
	@Override
	public void execute(final MiembroDomain data) {
		MiembroValidationRule.ejecutarValidacion(data);
		IdMiembroValidationRule.ejecutarValidacion(data.getId());
	}
}
