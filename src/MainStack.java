public class MainStack
{
    public static void main(String[] args)
    {
        MyStackDoubly<Integer> ms=new MyStackDoubly<Integer>();
        System.out.println("Size is : "+ms.size());
        System.out.println(ms.isEmpty());
        System.out.println(ms.pop());
        ms.push(63);
        System.out.println(ms.isEmpty());
        System.out.println(ms);
        System.out.println(ms.pop());
        ms.push(96);
        ms.push(82);
        ms.push(93);
        ms.push(12);
        System.out.println(ms);
        System.out.println(ms.contains(93));
        System.out.println(ms.contains(37));
        System.out.println("Size is : "+ms.size());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms);
        ms.clear();
        System.out.println(ms);
        System.out.println(ms.isEmpty());

    }
}
