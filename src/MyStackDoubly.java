public class MyStackDoubly<T>
{
    DoublyLinkedList<T> dl=new DoublyLinkedList<T>();

    public void push(T data)
    {
       dl.add(data);
    }

    public Object pop()
    {
        return dl.deleteLast();
    }

    public Object peek()
    {
       return dl.lastElement();
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
       return  dl.toString();
    }
}
