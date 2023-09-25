package ahorcado;

import static ahorcado.Impresora.imprimir;

public class Muneco {

	static void impresionMuneco(final int intentos)

	{
		switch (intentos) {
		case 5 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		case 4 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		case 3 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |  /    ");
			imprimir("    |       ");
			imprimir("    |    \\ ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		case 2 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |  /|   ");
			imprimir("    |   |   ");
			imprimir("    |    \\ ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		case 1 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |   |\\ ");
			imprimir("    |   |   ");
			imprimir("    |  / \\   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		case 0 -> {
			imprimir("    -----   ");
			imprimir("    |   |   ");
			imprimir("    |   |   ");
			imprimir("    |   0   ");
			imprimir("    |  /|\\ ");
			imprimir("    |   |   ");
			imprimir("    |  / \\   ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("    |       ");
			imprimir("------------");
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + intentos);
		}
	}
}
