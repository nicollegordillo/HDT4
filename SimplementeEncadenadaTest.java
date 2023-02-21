import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class SimplementeEncadenadaTest {
	
    SimplementeEncadenada SELista= new SimplementeEncadenada();

	@Test
	void isEmpty_test() {
		Boolean resultado;
		resultado= SELista.isEmpty();
		assertEquals(true,resultado);
	}
	
	@Test
	void size_test() {
		int resultado;
		SELista.add(2);
		SELista.add(3);
		SELista.add(1);
		resultado= SELista.size();
		assertEquals(3,resultado);
	}
	
	@Test
	void get_test() {
		Object resultado;
		SELista.add(2);
		SELista.add(3);
		SELista.add(1);
		resultado= SELista.get(1);
		assertEquals(1,resultado);
	}

	@Test
	void remove_test() {
		Object resultado;
		SELista.add(2);
		SELista.add(3);
		SELista.add(1);
		resultado= SELista.remove();
		assertEquals(1,resultado);
	}


}
