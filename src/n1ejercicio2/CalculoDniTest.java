package n1ejercicio2;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(Parameterized.class)

class CalculoDniTest {
	
	@ParameterizedTest
    @CsvSource ({"67099542,D","78730943,B","59389623,N","12469390,D",
            "77263951,M","43987542,L","33313266,C","33390845,C","63383533,H","25482903,F"})
	
	
	@Test

	public void testCalculoLetra(int dni,char letra) {

		assertEquals(letra, CalculoDni.calculoLetra(dni));

	}

}
