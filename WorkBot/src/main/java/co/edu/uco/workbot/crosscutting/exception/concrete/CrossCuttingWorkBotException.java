package co.edu.uco.workbot.crosscutting.exception.concrete;

import co.edu.uco.workbot.crosscutting.exception.WorkBotException;
import co.edu.uco.workbot.crosscutting.exception.enumerator.LugarException;

public class CrossCuttingWorkBotException extends WorkBotException {

	private static final long serialVersionUID = -9177484194126685659L;
	
	protected CrossCuttingWorkBotException(final Throwable exceptionRaiz, final String mensageUsuario,
			final String mensajeTecnico) {
		super(LugarException.CROSSCUTTING, exceptionRaiz, mensageUsuario, mensajeTecnico);
		
	}

	public static final WorkBotException crear(final String mensajeUsuario) {
		return new CrossCuttingWorkBotException(null, mensajeUsuario, mensajeUsuario);
	}
	
	public static final WorkBotException crear(final String mensajeUsuario, final String mensajeTecnico) {
		return new CrossCuttingWorkBotException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final WorkBotException crear(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new CrossCuttingWorkBotException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}


}
