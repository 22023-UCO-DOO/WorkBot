package ahorcado;

import java.security.SecureRandom;
import java.util.Random;

public class Palabra {
	private Palabra() {

	}

	private static final Random random = new SecureRandom();
	static String palabraSecreta = obtenerPalabraSecreta();
	static final char[] palabraGuiones = obtenerGuionesDePalabraSecreta(palabraSecreta);

	static String obtenerPalabraSecreta() {

		final int numeral = random.nextInt(Palabras.palabra.length);
		return Palabras.palabra[numeral];
	}

	static boolean hayGuiones(char[] array) {
		for (char l : array) {
			if (l == '_') {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

	static char[] obtenerGuionesDePalabraSecreta(final String palabra) {
		final int numeralPalabraSecreta = palabra.length();
		final char[] palabraGuion = new char[numeralPalabraSecreta];
		for (int i = 0; i < numeralPalabraSecreta; i++) {
			try {
				palabraGuion[i] = '_';
			}catch (StringIndexOutOfBoundsException exception) {
				System.out.println("Hay un problema con la palabra secreta o el programa no lo capto bien");
			}
			
		}
		return palabraGuion;
	}

	

}
