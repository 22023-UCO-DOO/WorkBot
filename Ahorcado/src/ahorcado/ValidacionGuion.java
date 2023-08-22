package ahorcado;

public class ValidacionGuion {
	static boolean hayGuiones(char[] array) {
		for (char l : array) {
			if (l == "_".charAt(l)) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}
}
