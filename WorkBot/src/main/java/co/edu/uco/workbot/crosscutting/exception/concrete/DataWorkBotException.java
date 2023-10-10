package co.edu.uco.workbot.crosscutting.exception.concrete;

import co.edu.uco.workbot.crosscutting.exception.WorkBotException;
import co.edu.uco.workbot.crosscutting.exception.enumerator.LugarException;

public class DataWorkBotException extends WorkBotException{

	
	private static final long serialVersionUID = -3286776052548052587L;
	
	protected DataWorkBotException(final Throwable exceptionRaiz, final String mensageUsuario,
			final String mensajeTecnico) {
		super(LugarException.CONTROLLER, exceptionRaiz, mensageUsuario, mensajeTecnico);

	}
	
	public static final WorkBotException crear(final String mensajeUsuario) {
		return new DataWorkBotException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final WorkBotException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new DataWorkBotException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final WorkBotException crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new DataWorkBotException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
