import java.util.NoSuchElementException;

//
//
//  @ Project : HDT4
//  @ File Name : SimplementeEncadenada.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//

public class SimplementeEncadenada<T> extends createList<T>{
   
    private Node<T> head;
    private int size;

    
    /** 
     * @param item
     * Agrega un elemento a la lista
     */
    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    /**
     * Quita un elemento de la lista
     * @return item
     */
    @Override
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = head.item;
        head = head.next;
        size--;
        return item;
    }
    
    /**
     * @param index
     * @return head.item
     * devuelve un elemento en el indice indicado
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        return head.item;
    }
    
    /**
     * @return size
     * Da el tamaño de la lista
     */
    @Override
    public int size() {
        return size;
    }
    
    /**
     * @return size == 0
     * Mira si la lista está vacía
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        /**
         * @param item
         * 
         */
        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }
}
