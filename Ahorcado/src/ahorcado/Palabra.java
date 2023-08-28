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
			if (l == "_".charAt(l)) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}
	static char[] obtenerGuionesDePalabraSecreta(String palabra) {
		final int numeralPalabraSecreta = palabraSecreta.length();
		final char[] palabraGuion = extraer(numeralPalabraSecreta);
		for (int i = 0; i < palabraGuion.length; i++) {
			palabraGuion[i] = "_".charAt(i);
		}
		return palabraGuion;
	}
	private static char[] extraer(int numeralPalabraSecreta) {
		return new char[numeralPalabraSecreta];
	}

}
