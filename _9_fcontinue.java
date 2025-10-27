package Javabymanvimaampw.java;

public class _9_fcontinue {
    public static void main(String[] args) {
        /*for(int num = 1; num <= 10; num++) {
            if(num % 2 == 0) {
                continue;
            }
            System.out.println(num);*/
            //while loops
            int num = 1;
            while(num<=50) {
                if(num % 3 == 0) {
                    num++;
                    continue;
                }
                System.out.println(num);
                num++;
            }
        }
    }

