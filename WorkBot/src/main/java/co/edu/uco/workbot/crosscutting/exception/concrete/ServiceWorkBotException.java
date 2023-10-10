package co.edu.uco.workbot.crosscutting.exception.concrete;

import co.edu.uco.workbot.crosscutting.exception.WorkBotException;
import co.edu.uco.workbot.crosscutting.exception.enumerator.LugarException;

public class ServiceWorkBotException extends WorkBotException{

	private static final long serialVersionUID = 4662674762628526145L;
	
	protected ServiceWorkBotException(final Throwable exceptionRaiz, final String mensageUsuario,
			final String mensajeTecnico) {
		super(LugarException.CONTROLLER, exceptionRaiz, mensageUsuario, mensajeTecnico);

	}
	
	public static final WorkBotException crear(final String mensajeUsuario) {
		return new ServiceWorkBotException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final WorkBotException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceWorkBotException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final WorkBotException crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceWorkBotException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
