package uco.edu.co.ahorcado;

import static uco.edu.co.ahorcado.Impresora.imprimir;

public class Muneco {

	private static final String base="------------";
	private static final String superior="    -----   ";
	private static final String cuerda="    |   |   ";
	static void impresionMuneco(final int intentos)

	{
		switch (intentos) {
		case 5 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir(cuerda);
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		case 4 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		case 3 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir(cuerda);
			imprimir("    |   0   ");
			imprimir("    |  /    ");
			imprimir("    |       ");
			imprimir("    |    \\ ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		case 2 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir(cuerda);
			imprimir("    |   0   ");
			imprimir("    |  /|   ");
			imprimir("    |   |   ");
			imprimir("    |    \\ ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		case 1 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir(cuerda);
			imprimir("    |   0   ");
			imprimir("    |   |\\ ");
			imprimir("    |   |   ");
			imprimir("    |  / \\   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		case 0 -> {
			imprimir(superior);
			imprimir(cuerda);
			imprimir(cuerda);
			imprimir("    |   0   ");
			imprimir("    |  /|\\ ");
			imprimir("    |   |   ");
			imprimir("    |  / \\   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir(base);
		}
		default -> throw new RuntimeException("Valor Inesperado: " + intentos);
		}
	}
}
