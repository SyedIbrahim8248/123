package Javabymanvimaampw.java;

public class _4_aBitwiseoperators {
    public static void main(String[] args) {
        //Bitwise OR (|)
        System.out.println(9|10);// 9->1001 ,10 -> 1010 = 1011 (11)
        System.out.println(9&10);//both bit are same the answer is 1
        System.out.println(9^10);// same number bits answer is zero and differt numbers bit the answer is 1
        System.out.println(9<<1);//left shift
        System.out.println(9<<2);
        System.out.println(9>>1);// Right shift
        System.out.println(9>>2);
        int p = 9;
        int q = 10;
        System.out.println(p&q);
        System.out.println(p|q);
        System.out.println(p^q);
        System.out.println(p<<1);
        System.out.println(p>>2);


    }
}
