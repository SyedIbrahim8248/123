package Javabymanvimaampw.java;
import java.util.Stack;

public class _23_freversestack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer>rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer>qt = new Stack<>();
        while(rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);
        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);


    }

}
