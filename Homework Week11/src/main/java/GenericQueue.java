import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericQueue<E>
{
    private ArrayList<E> list;

    public GenericQueue()
    {
        list = new ArrayList<>();
    }

    public E dequeue() throws EmptyStackException{
        return list.remove(0);
    }

    public void enqueue(E e) {
    list.add(e);
    }


    // current length of the queue
    public int length() {
        return list.size();
    }
}
