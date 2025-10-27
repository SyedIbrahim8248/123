package Javabymanvimaampw.java;

public class _17_lmaxarray {
    static void printArray(int[] arr, int idx) {
    }

    static int maxInArray(int[] arr, int idx) {
        //base case
        if (idx == arr.length - 1)
            return arr[idx];

        int smallAns = maxInArray(arr, idx + 1);
        //self work
        return Math.max(arr[idx], smallAns);

    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        //printArray(arr , 0);
        System.out.println(maxInArray(arr, 0));
    }
}
