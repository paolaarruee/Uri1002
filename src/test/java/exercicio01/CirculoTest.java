package exercicio01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void testGetArea() {
		Circulo c = new Circulo();
		c.setRaio(2.00);
		double expected = 12.5663;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.0001);
	}

}
