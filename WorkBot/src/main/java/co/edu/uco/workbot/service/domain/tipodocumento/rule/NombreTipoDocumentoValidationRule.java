package co.edu.uco.workbot.service.domain.tipodocumento.rule;

import co.edu.uco.workbot.crosscutting.exception.concrete.ServiceWorkBotException;
import co.edu.uco.workbot.crosscutting.util.UtilTexto;
import co.edu.uco.workbot.service.domain.ValidationRule;

public class NombreTipoDocumentoValidationRule implements ValidationRule<String> {

	private static final ValidationRule<String> instancia = new NombreTipoDocumentoValidationRule();
	public static final void ejecutarValidacion(final String dato) {
		instancia.validator(dato);
	}
	
	@Override
	public final void validator(final String dato) {
		validarLongitud(dato);
		validarObligatoriedad(dato);
		validarFormato(dato);

	}

	private final void validarLongitud(final String dato) {
		if(UtilTexto.longitudMaximaValida(dato, 50)) {
			throw ServiceWorkBotException.crear("La longitud del nombre del tipo de identificación no es valida. La longitud maxima son 50 caracteres");
		}
	}

	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación es un dato obligatorio...");
			
		}
	}

	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetrasCompletas(dato)) {
			throw ServiceWorkBotException.crear("El nombre del tipo de identificación solo puede contener letras...");
			
		}
	}

}
