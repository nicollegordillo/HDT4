//
//
//  @ Project : HDT4
//  @ File Name : IPilas.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public interface Ipilas<T>{
    void push(T value);
	
	T pull();
	
	T peek();

	Boolean isEmpty();
    
}
