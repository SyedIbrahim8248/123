package Javabymanvimaampw.java;

public class _20_aLinkedlistbyraghavsir {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
      /*  a.next = b;
        System.out.println(a.next.data);
        System.out.println(a.data);
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(b.next.data);
        System.out.println(c.next.data);
        System.out.println(d.next.data);*/
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
     /*   Node temp = a;
        for(int i = 1; i <= 5;i++) {
            System.out.println(temp.data);
            temp = temp.next;*/
        Node temp = a;
        while(temp!= null) {
            System.out.println(temp.data+ " ");
            temp = temp.next;

        }





    }
}
