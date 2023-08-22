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
	
}
