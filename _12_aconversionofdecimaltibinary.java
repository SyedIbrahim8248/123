package Javabymanvimaampw.java;

import java.util.Scanner;

public class _12_aconversionofdecimaltibinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while(decimal > 0) {
            int parity = decimal % 2;
            ans+=  (parity * pw);
            pw *= 10;
            decimal/=2;
        }
        System.out.println(ans);
    }
}
