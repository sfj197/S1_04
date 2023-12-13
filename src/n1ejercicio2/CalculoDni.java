package n1ejercicio2;

public class CalculoDni {

	public static char calculoLetra(int dni) {
		
		final char[] LETRA = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
	
		int indice = dni % 23;
		char letraCorrecta = LETRA[indice];
		
		return letraCorrecta;

	}

}
