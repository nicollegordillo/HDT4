public interface IList<T> {
    void add(T item);
    T remove();
    T get(int index);
    int size();
    boolean isEmpty();
    
}
