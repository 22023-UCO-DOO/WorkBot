package co.edu.uco.workbot.service.businesslogic.validator.concrete.miembro;

import co.edu.uco.workbot.service.businesslogic.validator.Validator;
import co.edu.uco.workbot.service.domain.miembro.MiembroDomain;
import co.edu.uco.workbot.service.domain.miembro.rule.IdMiembroValidationRule;
import co.edu.uco.workbot.service.domain.miembro.rule.IdentificacionMiembroValidationRule;
import co.edu.uco.workbot.service.domain.miembro.rule.MiembroValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.correo.rule.ConfirmacionCorreoElectronicoValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.correo.rule.CorreoCorreoElectronicoClienteValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.correo.rule.CorreoElectronicoValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.nombre.rule.NombreCompletoMiembroValidationRule;
import co.edu.uco.workbot.service.domain.miembro.support.nombre.rule.NombreNombreCompletoMiembroValidationRule;
import co.edu.uco.workbot.service.domain.tipodocumento.rule.NombreTipoDocumentoValidationRule;
import co.edu.uco.workbot.service.domain.tipodocumento.rule.TipoIdentificacionValidationRule;

public class ModifcarMiembroValidator implements Validator<MiembroDomain>{

	private static final Validator<MiembroDomain> instancia = new ModifcarMiembroValidator();
	private ModifcarMiembroValidator() {
		
	}
	
	public static final void ejecutarValidacion(final MiembroDomain dato) {
		instancia.execute(dato);
	}
	
	@Override
	public void execute(final MiembroDomain data) {
		MiembroValidationRule.ejecutarValidacion(data);
		IdMiembroValidationRule.ejecutarValidacion(data.getId());
		TipoIdentificacionValidationRule.ejecutarValidacion(data.getTipoDocumentoEntity());
		NombreTipoDocumentoValidationRule.ejecutarValidacion(data.getTipoDocumentoEntity().getNombre());
		IdentificacionMiembroValidationRule.ejecutarValidacion(data.getIdentificacion());
		NombreNombreCompletoMiembroValidationRule.ejecutarValidacion(data.getNombreCompleto().getNombre());
		NombreNombreCompletoMiembroValidationRule.ejecutarValidacion(data.getNombreCompleto().getApellido());
		NombreCompletoMiembroValidationRule.ejecutarValidacion(data.getNombreCompleto());
		CorreoCorreoElectronicoClienteValidationRule.ejecutarValidacion(data.getCorreo().getCorreoElectronico());
		ConfirmacionCorreoElectronicoValidationRule.ejecutarValidacion(data.getCorreo().isConfirmacionCorreoElectronico());
		CorreoElectronicoValidationRule.ejecutarValidacion(data.getCorreo());
	}
}
