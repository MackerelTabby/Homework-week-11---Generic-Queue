import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<E> {

    private final ArrayList<E> elements;
    public GenericStack()
    {
        this(10);
    }
    public GenericStack(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }
    public void push(E pushValue)
    {
        elements.add(pushValue);
    }
    public E pop() throws EmptyStackException {
        if(elements.isEmpty())
        {
            throw new EmptyStackException();
        }
            return elements.remove(elements.size() - 1);
    }

}
