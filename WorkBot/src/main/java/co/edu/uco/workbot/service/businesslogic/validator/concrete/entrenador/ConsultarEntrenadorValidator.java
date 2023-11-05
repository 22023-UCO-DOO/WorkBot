package co.edu.uco.workbot.service.businesslogic.validator.concrete.entrenador;

import co.edu.uco.workbot.service.businesslogic.validator.Validator;

import co.edu.uco.workbot.service.domain.calendario.CalendarioDomain;
import co.edu.uco.workbot.service.domain.calendario.rule.FechaCalendarioValidationRule;
import co.edu.uco.workbot.service.domain.calendario.rule.IdCalendarioValidationRule;

public class ConsultarEntrenadorValidator implements Validator<CalendarioDomain>{

	private static final Validator<CalendarioDomain> instancia = new ConsultarEntrenadorValidator();
	private ConsultarEntrenadorValidator() {
		
	}
	
	public static final void ejecutarValidacion(final CalendarioDomain dato) {
		instancia.execute(dato);
	}
	
	@Override
	public void execute(final CalendarioDomain data) {
		IdCalendarioValidationRule.ejecutarValidacion(data.getId());
		FechaCalendarioValidationRule.ejecutarValidacion(data.getFecha());
		
	}
}
