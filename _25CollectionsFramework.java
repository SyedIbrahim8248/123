package Javabymanvimaampw.java;
import java.util.*;

public class _25CollectionsFramework {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }

    public static void main(String[] args) {
        ArrayListExamples();
    }

}
