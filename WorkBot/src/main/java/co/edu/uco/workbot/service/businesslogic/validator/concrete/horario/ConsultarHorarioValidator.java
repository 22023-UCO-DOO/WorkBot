package co.edu.uco.workbot.service.businesslogic.validator.concrete.horario;

import co.edu.uco.workbot.service.businesslogic.validator.Validator;
import co.edu.uco.workbot.service.domain.calendario.rule.CalendarioValidationRule;
import co.edu.uco.workbot.service.domain.calendario.rule.FechaCalendarioValidationRule;
import co.edu.uco.workbot.service.domain.horario.HorarioDomain;
import co.edu.uco.workbot.service.domain.horario.rule.HoraFinalizacionHorarioValidationRule;
import co.edu.uco.workbot.service.domain.horario.rule.HoraInicioHorarioValidationRule;
import co.edu.uco.workbot.service.domain.horario.rule.HorarioValidationRule;
import co.edu.uco.workbot.service.domain.horario.rule.IdHorarioValidationRule;

public class ConsultarHorarioValidator implements Validator<HorarioDomain>{

	private static final Validator<HorarioDomain> instancia = new ConsultarHorarioValidator();
	private ConsultarHorarioValidator() {
		
	}
	
	public static final void ejecutarValidacion(final HorarioDomain dato) {
		instancia.execute(dato);
	}
	
	@Override
	public void execute(final HorarioDomain data) {
		HorarioValidationRule.ejecutarValidacion(data);
		IdHorarioValidationRule.ejecutarValidacion(data.getId());
		HoraInicioHorarioValidationRule.ejecutarValidacion(data.getHoraInicio());
		HoraFinalizacionHorarioValidationRule.ejecutarValidacion(data.getHoraFinalizacion());
		CalendarioValidationRule.ejecutarValidacion(data.getCalendario());
		FechaCalendarioValidationRule.ejecutarValidacion(data.getCalendario().getFecha());
		
	}
}
