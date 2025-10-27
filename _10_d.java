package Javabymanvimaampw.java;

import java.util.Scanner;

public class _10_d {
    //find the sum of the follwing series s = 1-2+3-4...n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                ans = ans -i;
            } else {
                ans = ans + i;
            }
        }
        System.out.println(ans);
    }
}
