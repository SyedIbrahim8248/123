package Javabymanvimaampw.java;

public class _17_cfibonacciseries {
    //find to find nth fibonacci number
    static int fib(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib( n - 2);
        //subproblems
     /*   int prev = fib(n - 1);
        int prevPrev = fib(n - 2);
        return prev + prevPrev;*/

    }

    public static void main(String[] args) {
        for(int i = 0;i<=10;i++)
            System.out.println(fib(i));
        System.out.println(fib(6));

    }
}
