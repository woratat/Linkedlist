package LinkedList;

public class LinkedList {
    Node head;

    public LinkedList(int element){  //constructor
        head = new Node(element);
        head.next=null;
    }
    public void getFirst(LinkedList l){
        int n = head.element;
        System.out.println("The first element is "+n);
    }
    public void addFirst(int element){
        Node temp = new Node(element);
        temp.next=head;
        head=temp;
    }
    public LinkedList removeFirst(LinkedList l){
        Node temp = head;
        if(temp!=null){
            head = temp.next;
        }
        return l;
    }
    public void printAll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.element+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void countAll(LinkedList l){
        int count = 0;
        Node temp = l.head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println("Total nodes: "+count);
    }
    public void getLast(LinkedList l){
        int last = 0;
        Node temp = head;
        while (temp!=null){
            last = temp.element;  //เก็บทุก element ที่วนผ่านไป
            temp=temp.next;  //เลื่อน temp ไปเรื่อยๆ
        }
        System.out.println("The last element is "+last);
    }



}
