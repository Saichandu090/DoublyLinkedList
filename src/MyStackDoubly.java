public class MyStackDoubly<Object>
{
    class Node
    {
        Object data;
        Node prev;
        Node next;
        Node(Object data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public void push(Object data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        n.prev=tail;
        tail.next=n;
        tail=n;
    }

    public Object pop()
    {
        if(head==null)
        {
            return (Object) "Stack is Empty!!";
        }
        Object data=tail.data;
        if (tail.prev != null)
        {
            tail.prev.next=null;
            tail=tail.prev;
        }
        else
        {
            head=tail=null;
        }
        return data;
    }

    public Object peek()
    {
        if(head==null)
            return (Object) "Stack is Empty!!";
        return tail.data;
    }

    public int size()
    {
        return size(head);
    }

    public int size(Node start)
    {
        if(start==null)
            return 0;
        return 1+size(start.next);
    }

    public boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    public void clear()
    {
        head=tail=null;
    }

    public boolean contains(Object data)
    {
        return contains(data,head);
    }

    public boolean contains(Object data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return contains(data,start.next);
    }

    @Override
    public String toString()
    {
        String st="[";
        Node temp=head;
        while(temp!=null)
        {
            st=st+temp.data;
            if(temp.next!=null)
                st=st+"->";
            temp=temp.next;
        }
        return st+"]";
    }
}
