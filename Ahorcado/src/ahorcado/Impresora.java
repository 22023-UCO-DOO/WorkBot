package ahorcado;

import java.util.logging.Logger;

public class Impresora {

	private Impresora() {
		
	}

	public static void imprimir(char[] palabraGuiones) {
		System.out.println(palabraGuiones);
	}
	public static void imprimir(int mensaje) {
		System.out.println(mensaje);
	}
	public static void imprimir(String mensaje) {
		Logger.getLogger(mensaje);
	}
	
}
