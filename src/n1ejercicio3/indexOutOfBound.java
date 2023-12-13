package n1ejercicio3;

import java.util.ArrayList;

public class indexOutOfBound {
	
	

	public String nombrar(ArrayList<String> nombres, int indice) {

		if (indice < 0 || indice > nombres.size()) {

			throw new IndexOutOfBoundsException("Fuera de rango");

		} else {

			return "Estas dentro de rango";
		}

	}
}
