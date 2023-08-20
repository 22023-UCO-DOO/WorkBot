package ahorcado;

import java.security.SecureRandom;
import java.util.Random;

public class Palabra {
	private static final Random random = new SecureRandom();
	static String obtenerPalabraSecreta() {
		final String[] palabra = { "casa", "perro", "coche" };
		final int numeral = random.nextInt(palabra.length);
		return palabra[numeral];
	}

}
