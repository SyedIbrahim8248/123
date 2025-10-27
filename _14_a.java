package Javabymanvimaampw.java;

public class _14_a {
    public static void main(String[] args) {
        int[] arr = {10,5,8,4,3};
        int ans = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]> ans ) {
                ans = arr[i];
            }
        }
        System.out.println("max" +ans);
        System.out.println();
        int[] arr1 = {10,5,8,4,3};
        int x = 8;
        int ans1 = -1;
        for(int i = 0;i<arr1.length;i++) {
            if(arr1[i] == x) {
                ans1 = i;
            }
        }
        System.out.println("Found" +x + "at index" +ans1);
        System.out.println();
    }


}
