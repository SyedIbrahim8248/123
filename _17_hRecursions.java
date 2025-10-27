package Javabymanvimaampw.java;
import java.util.*;

public class _17_hRecursions {
    //wap to print all natural numbers from 1 to n using recursion..
    static void printIncreasing(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    //PMI  principle if mathematics inductions
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }



}
