package Javabymanvimaampw.java;

public class _17_egivetonumberspandq {
    //Give two numbers p and q fin the value p^q using recursion function
    static int pow(int p, int q) {
        //base case
        if(q == 0) return 1;
        return pow(p, q-1) * p;
    }

    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
}
