package co.edu.uco.workbot.crosscutting.util;

import static co.edu.uco.workbot.crosscutting.util.UtilObjeto.obtenerValorDefecto;

public class UtilNumero {

	public static final byte ZERO = 0;

	private UtilNumero() {
		super();

	}

	public static final <T extends Number> T obtenerNumeroDefecto(T value, T defaultValue) {
		return obtenerValorDefecto(value, defaultValue);
	}

	public static final <T extends Number> Number obtenerNumeroDefecto(T value) {
		return obtenerValorDefecto(value, ZERO);
	}

	public static final <T extends Number> boolean isGreaterThan(T numberOne, T numberTwo) {
		return obtenerNumeroDefecto(numberOne).doubleValue() > obtenerNumeroDefecto(numberTwo).doubleValue();
	}

	public static final <T extends Number> boolean isLessThan(T numberOne, T numberTwo) {
		return obtenerNumeroDefecto(numberOne).doubleValue() < obtenerNumeroDefecto(numberTwo).doubleValue();
	}

	public static final <T extends Number> boolean isEqualsThan(T numberOne, T numberTwo) {
		return obtenerNumeroDefecto(numberOne).doubleValue() == obtenerNumeroDefecto(numberTwo).doubleValue();
	}

	public static final <T extends Number> boolean isGreaterOrEqualsThan(T numberOne, T numberTwo) {
		return obtenerNumeroDefecto(numberOne).doubleValue() >= obtenerNumeroDefecto(numberTwo).doubleValue();
	}

	public static final <T extends Number> boolean isLessOrEqualsThan(T numberOne, T numberTwo) {
		return obtenerNumeroDefecto(numberOne).doubleValue() <= obtenerNumeroDefecto(numberTwo).doubleValue();
	}
	public static final <T extends Number> boolean isDifferentThan(T numberOne, T numberTwo) {
		return isEqualsThan(numberOne, numberTwo);
	}

	
}
