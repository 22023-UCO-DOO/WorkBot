package co.edu.uco.transformate.crosscutting.exception;

import co.edu.uco.transformate.crosscutting.utils.UtilObject;
import co.edu.uco.transformate.crosscutting.utils.UtilText;

public abstract class TransformateException extends RuntimeException {

	private static final long serialVersionUID = 3805181101813139522L;

	private ExceptionType type;
	private String userMessage;

	protected TransformateException(String technicalMessage, String userMessage, Throwable rootMessage,
			ExceptionType type) {
		super(technicalMessage, rootMessage);
		setUserMessage(userMessage);
		setType(type);
	}

	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultIfEmpty(getMessage(), getUserMessage());
	}

	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());

	}

	public final ExceptionType getType() {
		return type;
	}

	private final void setType(ExceptionType type) {

		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return userMessage;
	}

	private final void setUserMessage(String usarMEssage) {
		this.userMessage = UtilText.getUtilText().getDefault(usarMEssage);
	}

}
