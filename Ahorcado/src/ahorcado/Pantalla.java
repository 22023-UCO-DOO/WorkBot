package ahorcado;


import static ahorcado.Palabra.palabraGuiones;
import static ahorcado.Juego.intentos;
import static ahorcado.Juego.letra;
import static ahorcado.Juego.algunaLetraAcertada;
import static ahorcado.Juego.juegoTerminado;


public class Pantalla {

	

	public static void main(String[] args) {

		

		do {
			Impresora.imprimir(intentos);
			Impresora.imprimir(palabraGuiones);
			Impresora.imprimir("Introduce una letra");
			
			
			Juego.juegoComprobacion(intentos, letra, palabraGuiones, algunaLetraAcertada);
			Juego.validacionLetraPalabra(algunaLetraAcertada, intentos);
			Juego.validacionJuegoTerminado(intentos, juegoTerminado, palabraGuiones);
		} while (!juegoTerminado);
		
	}

	

}
