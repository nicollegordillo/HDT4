import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Nicolle Gordillo
 *
 */
class ArraylistTest {
	
	arraylist st= new arraylist();

	@Test
	void arraylistPeek_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		resultado= st.peek();
		assertEquals(1,resultado);
		
	}
	
	@Test
	void arraylistPull_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.pull();
		assertEquals(5,resultado);
		
	}
	
	@Test
	void arraylistisEmpty_test() {
		Object resultado;
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(5);
		resultado= st.isEmpty();
		assertEquals(false,resultado);
		
	}

}
