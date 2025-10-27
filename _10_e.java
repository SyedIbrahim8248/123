package Javabymanvimaampw.java;

import java.util.Scanner;

public class _10_e {
    //Given 2 numbers a and b .find a raise to the powr b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1;i <=b;i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
