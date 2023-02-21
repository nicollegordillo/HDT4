import java.util.NoSuchElementException;
//
//
//  @ Project : HDT4
//  @ File Name : DoblementeEncadenada.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class DoblementeEncadenada<T> extends createList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    
    /** 
     * @param item
     * Agrega un elemento a la lista
     */
    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
        T item = tail.item;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
        return item;
    }

    /**
     * @param index
     * @return current.item
     * devuelve un elemento en el indice indicado
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.item;
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
        Node<T> prev;
        Node<T> next;

        /**
         * @param item
         * 
         */
        Node(T item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }
    }
}
    
