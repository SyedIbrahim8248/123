package Javabymanvimaampw.java;
import java.util.*;

public class _25_ESetInterFaceExamples {
    public static void main(String[] args) {
        HashSet<Integer>st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
     /*   st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());*/
    }
}
