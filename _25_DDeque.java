package Javabymanvimaampw.java;
import java.util.*;

public class _25_DDeque {
    static void DequeExamples(){
        Deque<Integer> dq  = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        

    }

    public static void main(String[] args) {
        DequeExamples();
    }
}
