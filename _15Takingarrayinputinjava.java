package Javabymanvimaampw.java;

import java.util.Scanner;

public class _15Takingarrayinputinjava {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter" + n + "elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.println(arr1[i] + " ");
        }
    }
}
