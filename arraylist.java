import java.util.ArrayList;

public class arraylist<T> extends Implementacion<T>{
    private ArrayList<T> elements;

    public arraylist() {
        elements = new ArrayList<>();
    }

    @Override
    public T pull() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    @Override
    public void push(T value) {
        elements.add(value);
        
    }

    @Override
    public Boolean isEmpty() {
        return elements.isEmpty();
    }
    
}
