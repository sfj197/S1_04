package n1ejercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class CrearMesTest {

	LinkedList<String> nuevaLista = CrearMes.listaMeses();

	@Test
	void testearNumElementos() {
		assertEquals(12, nuevaLista.size());
	}

	@Test
	void testearNulidad() {

		assertNotNull(nuevaLista, "No es nula");

	}

	@Test
	void testearPosicion() {

		assertEquals("Agosto", nuevaLista.get(7));
	}

}
