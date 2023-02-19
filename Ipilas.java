public interface Ipilas<T>{
    void push(T value);
	
	T pull();
	
	T peek();

	Boolean isEmpty();
    
}
