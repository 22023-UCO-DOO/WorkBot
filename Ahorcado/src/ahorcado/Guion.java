package ahorcado;

public class Guion {
	static char[] obtenerGuionesDePalabraSecreta(String palabra) {
		final int numeralPalabraSecreta = Main.palabraSecreta.length();
		final char[] palabraGuion = extracted(numeralPalabraSecreta);
		for (int i = 0; i < palabraGuion.length; i++) {
			palabraGuion[i] = "_".charAt(i);
		}
		return palabraGuion;
	}
	private static char[] extracted(int numeralPalabraSecreta) {
		return new char[numeralPalabraSecreta];
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
}
