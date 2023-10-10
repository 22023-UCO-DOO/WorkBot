package uco.edu.co.ahorcado;

import static uco.edu.co.ahorcado.Palabras.PALABRASSECRETA;

public class Palabra {
	
	public static String palabraSecreta;
    public static StringBuilder palabraDescubierta;
    public static final void seleccionarPalabraSecreta() {
        final int indice = (int) (Math.random() * PALABRASSECRETA.length);
        palabraSecreta = PALABRASSECRETA[indice];
    }

    public static final void inicializarPalabraDescubierta() {
        palabraDescubierta = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraDescubierta.append("_");
        }
    }

    public static final void actualizarPalabraDescubierta(char letra) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraDescubierta.setCharAt(i, letra);
            }
        }
    }
    
   
}
