package Javabymanvimaampw.java;

public class _17_bprintfactorials {
    static int factorial(int n){
        //base case
        if(n == 0) return 1;
        //smalle problem - recursive work
      // int smallAns = factorial(n - 1);
        //  big problem - self work
     //   int ans = n * smallAns;
       // return ans;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial( 5));
    }
}
