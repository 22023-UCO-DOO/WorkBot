package ahorcado;

import java.util.Scanner;
import static ahorcado.Palabra.palabraSecreta;
import static ahorcado.Palabra.hayGuiones;

public class Juego {

	private Juego() {

	}

	static final Scanner lector = new Scanner(System.in);
	static final char letra = lector.next().charAt(0);
	static boolean algunaLetraAcertada = false;
	static boolean juegoTerminado = false;
	static final int intentos = 5;

	public static void juegoComprobacion(int intentos, char letra, char[] palabraGuiones, boolean algunaLetraAcertada) {
		for (int i = 0; i < palabraSecreta.length(); i++) {
			Muneco.impresionMuneco(intentos);
			if (palabraSecreta.charAt(i) == letra) {
				palabraGuiones[i] = letra;
				algunaLetraAcertada = true;
			}
		}

	}

	public static void validacionLetraPalabra(boolean algunaLetraAcertada, int intentos) {
		if (algunaLetraAcertada) {
			return;
		}
		Impresora.imprimir("No has acertado ninguna plabra");
		intentos -= 1;
	}

	public static void validacionJuegoTerminado(int intentos, boolean juegoTerminado, char[] palabraGuiones) {
		if (intentos == 0) {
			Impresora.imprimir("Has perdido debido a que has agotado todos los intentos");
			juegoTerminado = true;
		} else {
			final boolean juegoGanado =hayGuiones(palabraGuiones);
			if (juegoGanado) {
				Impresora.imprimir(palabraSecreta);
				juegoTerminado = true;
			}
		}
	}

}
