package ahorcado;



public class Letra {
	public static void validacionLetra(boolean algunaLetraAcertada, int intentos) {
		if (algunaLetraAcertada) {
			return;
		}
		Impresora.imprimir("No has acertado ninguna plabra");
		intentos-=1;
	}
}
