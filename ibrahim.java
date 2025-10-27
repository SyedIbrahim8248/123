package Javabymanvimaampw.java;

import java.util.Scanner;

public class ibrahim {
    //print the sum of the stream of integrs in the input.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num!= -1) {
            sum += num;
            num = sc.nextInt();

        }
        System.out.println(sum);
    }
}
