package Javabymanvimaampw.java;

import java.util.Scanner;

public class _10_a {
    //count the number of  digits for a given number n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfdigits = 0;
        int original_n = n;
        while (n > 0) {
            n = n / 10;
            numOfdigits++;
        }
        System.out.println("Number of digits in " +original_n +" is " + numOfdigits);

    }
}




