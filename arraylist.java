import java.util.ArrayList;
//
//
//  @ Project : HDT4
//  @ File Name : arraylist.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class arraylist<T> extends Implementacion<T>{
    private ArrayList<T> elements;
    
    public arraylist() {
        elements = new ArrayList<>();
    }

    
    /** 
     * @return T
     * Saca un elemento de stack
     */
    @Override
    public T pull() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    /**
     * @return T
     * Mira el elemento de hasta arriba del stack sin eliminarlo
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    /**
     * @param value
     * Agrega un elemento al stack
     */
    @Override
    public void push(T value) {
        elements.add(value);
        
    }

    /**
     * @return Boolean
     * Mira si el stack está vacío
     */
    @Override
    public Boolean isEmpty() {
        return elements.isEmpty();
    }
    
}
