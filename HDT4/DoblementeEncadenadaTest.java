import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class DoblementeEncadenadaTest {

	DoblementeEncadenada DELista= new DoblementeEncadenada();

	@Test
	void isEmpty_test() {
		Boolean resultado;
		resultado= DELista.isEmpty();
		assertEquals(true,resultado);
	}
	
	@Test
	void size_test() {
		int resultado;
		DELista.add(2);
		DELista.add(3);
		DELista.add(1);
		resultado= DELista.size();
		assertEquals(3,resultado);
	}
	
	@Test
	void get_test() {
		Object resultado;
		DELista.add(2);
		DELista.add(3);
		DELista.add(1);
		resultado= DELista.get(1);
		assertEquals(3,resultado);
	}

	@Test
	void remove_test() {
		Object resultado;
		DELista.add(2);
		DELista.add(3);
		DELista.add(1);
		resultado= DELista.remove();
		assertEquals(1,resultado);
	}

}
