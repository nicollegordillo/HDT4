import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class CalculadoraTest {

	Calculadora calc = Calculadora.getInstance();
	@Test
	void infixtopostfix_test() {
		ImplementacionInstance imp= new ImplementacionInstance();
		String resultado;
		resultado= calc.infixapostfix("(2+3)*9", imp.Instanciar(1, 0));
		assertEquals("23+9*",resultado);
	}
	
	@Test
	void evaluar_test() {
		ImplementacionInstance imp= new ImplementacionInstance();
		int resultado;
		calc.infixapostfix("(2+3)*9", imp.Instanciar(1, 0));
		resultado= calc.evaluar(imp.Instanciar(1, 0));
		assertEquals(45,resultado);
	}

}
