package uco.edu.co.ahorcado;

import static uco.edu.co.ahorcado.Palabra.palabraDescubierta;
import static uco.edu.co.ahorcado.Palabra.palabraSecreta;
import static uco.edu.co.ahorcado.Palabra.actualizarPalabraDescubierta;
import static uco.edu.co.ahorcado.Palabra.inicializarPalabraDescubierta;
import static uco.edu.co.ahorcado.Palabra.seleccionarPalabraSecreta;
import static uco.edu.co.ahorcado.Impresora.imprimir;
import static uco.edu.co.ahorcado.Muneco.impresionMuneco;
import java.util.Scanner;

public class Juego {

	private static int intentosRestantes = 6;
	private static String entrada;
	public static void main(String[] args) {
		seleccionarPalabraSecreta();
		inicializarPalabraDescubierta();
		final Scanner scanner = new Scanner(System.in);
		while (intentosRestantes > 0 && !palabraDescubierta.toString().equals(palabraSecreta)) {
			imprimir("Palabra a adivinar: " + palabraDescubierta.toString());
			imprimir("Intentos restantes: " + intentosRestantes);
			imprimir("Ingresa una letra: ");
            entrada = scanner.nextLine().toLowerCase();

            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
            	imprimir("Por favor, ingresa una única letra válida.");
                continue;
            }

            final char letra = entrada.charAt(0);

            if (palabraSecreta.contains(entrada)) {
                actualizarPalabraDescubierta(letra);
            } else {
                intentosRestantes--;
                impresionMuneco(intentosRestantes);
                imprimir("¡Letra incorrecta!");
            }
        }

        if (palabraDescubierta.toString().equals(palabraSecreta)) {
        	imprimir("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
        	imprimir("¡Has agotado tus intentos! La palabra secreta era: " + palabraSecreta);
        }

        scanner.close();
	}
}
