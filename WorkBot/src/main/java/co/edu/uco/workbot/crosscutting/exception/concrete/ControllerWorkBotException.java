package co.edu.uco.workbot.crosscutting.exception.concrete;

import co.edu.uco.workbot.crosscutting.exception.WorkBotException;
import co.edu.uco.workbot.crosscutting.exception.enumerator.LugarException;

public class ControllerWorkBotException extends WorkBotException {

	private static final long serialVersionUID = -2602271099210677563L;
	
	protected ControllerWorkBotException(final Throwable exceptionRaiz, final String mensageUsuario,
			final String mensajeTecnico) {
		super(LugarException.CONTROLLER, exceptionRaiz, mensageUsuario, mensajeTecnico);

	}
	
	public static final WorkBotException crear(final String mensajeUsuario) {
		return new ControllerWorkBotException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final WorkBotException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new ControllerWorkBotException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final WorkBotException crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new ControllerWorkBotException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
