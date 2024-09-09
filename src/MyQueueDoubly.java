public class MyQueueDoubly<T>
{
    DoublyLinkedList<T> dl=new DoublyLinkedList<T>();

    public void enQueue(T data)
    {
       dl.add(data);
    }

    public T deQueue()
    {
       return dl.deleteFirst();
    }

    public T peek()
    {
       return dl.firstElement();
    }

    public int size()
    {
        return dl.size();
    }

    public boolean isEmpty()
    {
        return dl.isEmpty();
    }

    public void clear()
    {
        dl.clear();
    }

    public boolean contains(T data)
    {
        return dl.contains(data);
    }

    @Override
    public String toString()
    {
       return dl.toString();
    }
}
