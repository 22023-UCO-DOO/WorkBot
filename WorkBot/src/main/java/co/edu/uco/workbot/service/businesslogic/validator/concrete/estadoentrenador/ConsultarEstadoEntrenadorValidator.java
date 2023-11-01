package co.edu.uco.workbot.service.businesslogic.validator.concrete.estadoentrenador;

import co.edu.uco.workbot.service.businesslogic.validator.Validator;

import co.edu.uco.workbot.service.domain.estadoentrenador.EstadoEntrenadorDomain;
import co.edu.uco.workbot.service.domain.estadoentrenador.rule.EstadoEntrenadorValidationRule;
import co.edu.uco.workbot.service.domain.estadoentrenador.rule.IdEstadoEntrenadorValidationRule;
import co.edu.uco.workbot.service.domain.estadoentrenador.rule.NombreEstadoEntrenadorValidationRule;


public class ConsultarEstadoEntrenadorValidator implements Validator<EstadoEntrenadorDomain>{

	private static final Validator<EstadoEntrenadorDomain> instancia = new ConsultarEstadoEntrenadorValidator();
	private ConsultarEstadoEntrenadorValidator() {
		
	}
	
	public static final void ejecutarValidacion(final EstadoEntrenadorDomain dato) {
		instancia.execute(dato);
	}
	
	@Override
	public void execute(final EstadoEntrenadorDomain data) {
		EstadoEntrenadorValidationRule.ejecutarValidacion(data);
		IdEstadoEntrenadorValidationRule.ejecutarValidacion(data.getId());
		NombreEstadoEntrenadorValidationRule.ejecutarValidacion(data.getNombre());
		
		
		
	}
}
