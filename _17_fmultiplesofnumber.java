package Javabymanvimaampw.java;
import java.util.*;

public class _17_fmultiplesofnumber {
    //Give a number num and a value k.print k multiples of num
    static void printMultiples(int n , int k) {
        //base case
        if(k == 1){
            System.out.println(n);
            return;
        }
        //recursive work
        printMultiples(n, k - 1);
        //self work
        System.out.println(n * k);
     }
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        int n = sc.nextInt();
        int  k = sc.nextInt();
        printMultiples(n, k);

    }
}
