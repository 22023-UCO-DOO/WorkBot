package ahorcado;

import static ahorcado.Palabra.obtenerPalabraSecreta;

import java.util.Scanner;

public class Main {

	static String palabraSecreta = obtenerPalabraSecreta();

	public static void main(String[] args) {

		final char[] palabraGuiones = Guion.obtenerGuionesDePalabraSecreta(palabraSecreta);
		boolean juegoTerminado = false;
		int intentos = 5;
		final Scanner lector = new Scanner(System.in);

		do {
			Impresora.imprimir(intentos);
			Impresora.imprimir(palabraGuiones);
			Impresora.imprimir("Introduce una letra");
			final char letra = lector.next().charAt(0);
			boolean algunaLetraAcertada = false;
			Juego.juegoComprobacion(intentos, letra, palabraGuiones, algunaLetraAcertada);
			Letra.validacionLetra(algunaLetraAcertada, intentos);
			ValidacionJuego.validacionJuegoTerminado(intentos, juegoTerminado, palabraGuiones);
		} while (!juegoTerminado);
		lector.close();
	}

	

}
