import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class ListaTest {

	lista st= new lista(2);

	@Test
	void ListaPeek_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		resultado= st.peek();
		assertEquals(1,resultado);
		
	}
	
	@Test
	void ListaPull_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.pull();
		assertEquals(5,resultado);
		
	}
	
	@Test
	void ListaisEmpty_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.isEmpty();
		assertEquals(false,resultado);
		
	}

}
