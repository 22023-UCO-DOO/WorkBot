package ahorcado;

public class Juego {
	

	public static void juegoComprobacion(int intentos, char letra, char[] palabraGuiones, boolean algunaLetraAcertada) {
		for (int i = 0; i < Main.palabraSecreta.length(); i++) {
			Muneco.impresionMuneco(intentos);
			if (Main.palabraSecreta.charAt(i) == letra) {
				palabraGuiones[i] = letra;
				algunaLetraAcertada = true;
			}
		}
		
	}
}
