package Javabymanvimaampw.java;

import java.util.Scanner;

public class _10_b {
    //find the sum of digits in a given number n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfdigits = 0;
        int original_n = n;
        while(n>0) {
            sumOfdigits+=n%10;
            n/=10;//n = n/10
        }
        System.out.println("Nummber of digits in " + original_n + " is " + sumOfdigits);

    }
}
