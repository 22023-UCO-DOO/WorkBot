package ahorcado;

import static ahorcado.Impresora.imprimir;

public class Muneco {
	
	static void impresionMuneco(int intentos)

	{

		if (intentos == 5)

		{

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

		if (intentos == 4)

		{

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

		if (intentos == 3)

		{

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

		if (intentos == 2)

		{

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

		if (intentos == 1)

		{

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

		if (intentos == 0) {
		
		}
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

}
