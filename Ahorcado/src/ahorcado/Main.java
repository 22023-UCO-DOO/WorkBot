package ahorcado;

import static  ahorcado.Palabra.obtenerPalabraSecreta;

import java.util.Scanner;


public class Main {
	
	static String palabraSecreta = obtenerPalabraSecreta();
	public static void main(String[] args){
		
			
			final char[] palabraGuiones= Guion.obtenerGuionesDePalabraSecreta(palabraSecreta);
			boolean juegoTerminado=false;
			final Scanner lector= new Scanner(System.in);
		int intentos=5;
			do{
				Impresora.imprimir(intentos);
				Impresora.imprimir(palabraGuiones);
				Impresora.imprimir("Introduce una letra");
				final char letra=lector.next().charAt(0);
				boolean algunaLetraAcertada=false;
				for(int i = 0;i<palabraSecreta.length();i++){
					Muneco.impresionMuneco(intentos);
					if(palabraSecreta.charAt(i)==letra){
						palabraGuiones[i]=letra;
						algunaLetraAcertada=true;
					}
				}
				if(!algunaLetraAcertada){Impresora.imprimir("No has acertado ninguna plabra");
				--intentos;
				}
				if(intentos==0) {
					Impresora.imprimir("Has perdido debido a que has agotado todos los intentos");
					juegoTerminado=true;
				}else{
					final boolean juegoGanado= Guion.hayGuiones(palabraGuiones);
					if(juegoGanado){
						Impresora.imprimir(palabraSecreta);
						juegoTerminado=true;
					}
				}
			}while(!juegoTerminado);
lector.close();
	}
	
		
			

	



	
}
