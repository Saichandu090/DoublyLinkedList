public class MainQueue
{
    public static void main(String[] args) {

        MyQueueDoubly<String> mq=new MyQueueDoubly<String>();
        System.out.println(mq.deQueue());
        System.out.println(mq.peek());
        System.out.println(mq.isEmpty());
        System.out.println("Size is : "+mq.size());
        mq.enQueue("Sai");
        mq.enQueue("Jenny");
        System.out.println(mq.peek());
        mq.enQueue("Rahil");
        mq.enQueue("Bibek");
        System.out.println(mq);
        System.out.println(mq.contains("Jenny"));
        System.out.println(mq.deQueue());
        System.out.println(mq.deQueue());
       // mq.clear();
        System.out.println(mq);
        System.out.println("Size is : "+mq.size());
        System.out.println(mq.peek());
        System.out.println(mq.isEmpty());
    }
}
