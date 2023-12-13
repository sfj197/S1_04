package n1ejercicio3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

public class indexOutOfBoundTest {

	
	@Test
	
	public void indiceFueraDeRangoTest() {
		
		indexOutOfBound nuevo = new indexOutOfBound();
		
		ArrayList<String> coches = new ArrayList<String>();
		
		coches.add("Renault");
		coches.add("Peugeot");
		coches.add("Seat");
		coches.add("Tesla");
		
		assertThrows(IndexOutOfBoundsException.class,() -> 
		{nuevo.nombrar(coches, 5);
		});
		
		
	
	}
}
