import java.util.ArrayList;
import java.util.List;
//
//
//  @ Project : HDT4
//  @ File Name : lista.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class lista<T> extends Implementacion<T>{
    private createList<T> stack;
    createListFactory lista = new createListFactory();
    public lista(int type2) {
        stack = lista.Instanciar(type2);//
    }

    
    /** 
     * @return T
     * Saca un elemento de stack
     */
    @Override
    public T pull() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove();
    }

    /**
     * @return T
     * Mira el elemento de hasta arriba del stack sin eliminarlo
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    /**
     * @param value
     * Agrega un elemento al stack
     */
    @Override
    public void push(T value) {
        stack.add(value);
        
    }

    /**
     * @return Boolean
     * Mira si el stack está vacío
     */
    @Override
    public Boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
