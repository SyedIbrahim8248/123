package Javabymanvimaampw.java;

public class _20_Clengthmethod {
    public static void displayr(Node head){
        if(head == null) return;
        displayr(head.next);
        System.out.print(head.data+" ");
    }
    public static void displayreverse(Node head) {
        if (head == null) return;
        displayreverse(head.next);
        System.out.println(head.data + " ");
    }
    public static void display(Node head) {
        while(head!= null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next ;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a  = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);
        a.next = b;
        b .next = c;
        c.next = d;
        d.next = e;
        System.out.println(length(a));






    }
}


