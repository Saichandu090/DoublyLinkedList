public class DoublyLinkedList<T>
{
    class Node
    {
        T data;
        Node prev;
        Node next;
        Node(T data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public void add(T data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }

    public void addFirst(T data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        n.next=head;
        head.prev=n;
        head=n;
    }

    public void addAt(T data,int index)
    {
        Node n=new Node(data);
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&index>0)
        {
            prev=temp;
            temp=temp.next;
            index--;
        }
        if(temp!=null)
        {
            n.next=temp;
            temp.prev=n;
            prev.next=n;
            n.prev=prev;
        }
        else
            System.out.println("Index out of Range!!!");
    }

    public T firstElement()
    {
        if(head==null)
            return null;
        return head.data;
    }

    public T lastElement()
    {
        if(tail==null)
            return null;
        return tail.data;
    }

    public T deleteFirst()
    {
        if(head==null)
            return  (T)"List is Empty!!";
        T data=head.data;
        head=head.next;
        head.prev=null;
        return data;
    }

    public T deleteAt(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&index>0)
        {
            prev=temp;
            temp=temp.next;
            index--;
        }
        if(temp!=null)
        {
            prev.next=temp.next;
            if(temp.next!=null)
              temp.next.prev=prev;
        }
        else
        {
            return (T) "Index out of Range!!";
        }
        return temp.data;
    }

    public T deleteLast()
    {
        if(head==null)
            return (T) "List is Empty!!";
        T data=tail.data;
        if(tail.prev!=null)
        {
            tail.prev.next = null;
            tail = tail.prev;
        }
        else {
            head = null;
        }
        return data;
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

    public void display()
    {
        display(head);
    }

    public void display(Node start)
    {
        if(start==null)
            return;
        System.out.println(start.data);
        display(start.next);
    }

    public void displayReverse()
    {
        displayReverse(head);
    }

    public void displayReverse(Node start)
    {
        if(start.next!=null)
            displayReverse(start.next);
        System.out.println(start.data);
    }

    public boolean contains(T data)
    {
        return contains(data,head);
    }

    public boolean contains(T data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return contains(data,start.next);
    }

    public void reverse()
    {
        Node temp=head;
        Node curr=null;
        while(temp!=null)
        {
            curr=temp.next;
            temp.next=temp.prev;
            temp.prev=curr;
            temp=curr;
        }
        curr=head;
        head=tail;
        tail=curr;
    }

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
