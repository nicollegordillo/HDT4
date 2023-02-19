import java.util.ArrayList;
import java.util.List;

public class lista<T> extends Implementacion<T>{
    private createList<T> stack;
    createListFactory lista = new createListFactory();
    public lista(int type2) {
        stack = lista.Instanciar(type2);//
    }

    @Override
    public T pull() {
        if (isEmpty()) {
            return null;
        }
        return stack.remove();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public void push(T value) {
        stack.add(value);
        
    }

    @Override
    public Boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
