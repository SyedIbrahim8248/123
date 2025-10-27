package Javabymanvimaampw.java;
import java.util.*;

public class _26_DHashSet {
    public static void main(String[] args) {
        HashSet<String>st = new HashSet<>();
        st.add("ibrahim");
        st.add("HASAN");
        st.add("Hussain");
        System.out.println(st);
        System.out.println(st.contains("ibrahim"));
        System.out.println(st.size());
        st.remove("ibrahim");
        System.out.println(st.contains("ibrahim"));
        System.out.println("Mark");
        for(String s :st){
            System.out.println(s);
        }

    }

}
