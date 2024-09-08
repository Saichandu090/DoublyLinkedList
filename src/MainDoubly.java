public class MainDoubly
{
    public static void main(String[] args) {

        DoublyLinkedList<Integer> dl=new DoublyLinkedList<Integer>();
        System.out.println("Size is : "+dl.size());
        System.out.println(dl.deleteFirst());
        System.out.println(dl.delete(0));
        System.out.println(dl.deleteLast());
        dl.add(85,0);
        System.out.println("Size is : "+dl.size());
        dl.add(32);
        System.out.println("Size is : "+dl.size());
        dl.add(25);
        dl.add(96);
        dl.add(78); //Works as 'addLast' as well
        dl.addFirst(99);
        dl.addFirst(100);
        dl.add(237,5);
        System.out.println(dl);
        dl.reverse();
        System.out.println(dl);
        System.out.println("Size is : "+dl.size());
        System.out.println(dl.deleteLast());
        System.out.println(dl.deleteLast());
        //System.out.println(dl.delete(6));
        System.out.println(dl);
        dl.display();
        System.out.println("========");
        dl.displayReverse();
        System.out.println(dl.contains(100));
        System.out.println(dl.contains(237));
    }
}
