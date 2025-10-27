package Javabymanvimaampw.java;
import java.util.*;

public class _17_aRecursions {
    //wap to print all natural numbers from n to 1 using recursions..
    static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        // recursive work
        printDecreasing(n - 1);

    }

    static void printIncreasing(int n) {}
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printDecreasing(n);
        }
    }

