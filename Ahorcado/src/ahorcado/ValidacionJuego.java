package ahorcado;

public class ValidacionJuego {
	public static void validacionJuegoTerminado(int intentos,boolean juegoTerminado,char[] palabraGuiones) {
		if(intentos==0) {
			Impresora.imprimir("Has perdido debido a que has agotado todos los intentos");
			juegoTerminado=true;
		}else{
			final boolean juegoGanado= ValidacionGuion.hayGuiones(palabraGuiones);
			if(juegoGanado){
				Impresora.imprimir(Main.palabraSecreta);
				juegoTerminado=true;
			}
		}
	}
}
