package Javabymanvimaampw.java;

import java.util.Scanner;

public class _11_cNumericalrectangularpatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i-1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
