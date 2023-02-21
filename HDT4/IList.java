//
//
//  @ Project : HDT4
//  @ File Name : IList.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public interface IList<T> {
    void add(T item);
    T remove();
    T get(int index);
    int size();
    boolean isEmpty();
    
}
