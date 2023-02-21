import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class VectoresTest {

	vectores st= new vectores();

	@Test
	void VectoresPeek_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		resultado= st.peek();
		assertEquals(1,resultado);
		
	}
	
	@Test
	void VectoresPull_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.pull();
		assertEquals(5,resultado);
		
	}
	
	@Test
	void VectoresisEmpty_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.isEmpty();
		assertEquals(false,resultado);
		
	}

}
