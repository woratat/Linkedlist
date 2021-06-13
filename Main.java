package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList(10);

        l.addFirst(9);
        l.addFirst(8);
        l.addFirst(7);
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.addFirst(66);


        l.removeFirst(l);


        l.getFirst(l);
        l.getLast(l);

        System.out.println();
        l.printAll();
        l.countAll(l);
        System.out.println("มี 7 กับ 66 โดนลบไป");
    }
}
