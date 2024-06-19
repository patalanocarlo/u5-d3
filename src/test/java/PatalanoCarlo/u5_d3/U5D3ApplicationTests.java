package PatalanoCarlo.u5_d3;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class U5D3ApplicationTests {



	//Primo Esercizio:
	@Test
	void EqualNumbers(){
		int numero1=3;
		int numero2=2;
		int sommaNumeri=numero1 + numero2;
		assertEquals(5,sommaNumeri);
	}


	//Secondo Esercizio:
	@Test
 void filtroStringhe() {
		CustomFunction customFunction = new CustomFunction();
		String[] input = {"cat", "dog", "hat", "bag", "Tv", "phone", "air"};
		List<String> expectedString = Arrays.asList("cat", "hat", "bag", "air" ,"dog");

		List<String> actual = customFunction.filtroStringhe(input);
		Collections.sort(actual);
		Collections.sort(expectedString);

		assertEquals(expectedString, actual, "Dovrebbe riportarmi le stringhe filtrate che desidero");
	}

	//terzo esercizio
	@Test
	void ConcatenationString(){
		String string="Hello" + " World";
		assertEquals("Hello World", string);
	}
	//quarto esercizio
	@Test
	void pariODispari() {
		CustomFunction customFunction = new CustomFunction();
		int numero1 = 21;
		int numero2 = 4;
		assertTrue("Il numero 4 dovrebbe essere pari", customFunction.isEven(numero2));
		assertFalse(customFunction.isEven(numero1), "Il numero 21 dovrebbe essere dispari");
	}
//Quinto Esercizio
	@Test
	void testException() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("Invalid argument");
		});
		assertEquals("Invalid argument", exception.getMessage());
	}

	//terzo esercizio
	@Test
	void ConcatenationString(){
		String string="Hello" + " World";
		assertEquals("Hello World", string);
	}
}


