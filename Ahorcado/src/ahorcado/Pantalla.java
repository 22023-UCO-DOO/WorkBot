package ahorcado;


import static ahorcado.Palabra.palabraGuiones;
import static ahorcado.Juego.INTENTOS;
import static ahorcado.Juego.LETRA;
import static ahorcado.Juego.algunaLetraAcertada;
import static ahorcado.Juego.juegoTerminado;


public class Pantalla {

	

	public static void main(String[] args) {

		

		do {
			//Impresora.imprimir(INTENTOS);
			Impresora.imprimir("Introduce una letra");
			Impresora.imprimir(palabraGuiones);
			
			
			
			Juego.juegoComprobacion(INTENTOS, LETRA, palabraGuiones, algunaLetraAcertada);
			Juego.validacionLetraPalabra(algunaLetraAcertada, INTENTOS);
			Muneco.impresionMuneco(INTENTOS);
			Juego.validacionJuegoTerminado(INTENTOS, juegoTerminado, palabraGuiones);
		} while (!juegoTerminado);
		
	}

	

}
