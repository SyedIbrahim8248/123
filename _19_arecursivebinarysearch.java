package Javabymanvimaampw.java;

public class _19_arecursivebinarysearch {
    static boolean binarySearch(int[] a, int target) {
        return false;
    }
    static boolean recBinarySearch(int[] a, int st, int end, int target) {
        if (st > end) return false;
        int mid = (st + end) / 2;
        if (target == a[mid]) {
            return true;
        } else if (target < a[mid]) {
            return recBinarySearch(a, st, mid - 1, target);
        } else {
            return recBinarySearch(a, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int target = 0;
        while (target != 10) {
            System.out.printf("%d exits in arr: %b \n", target, recBinarySearch(a, 0, a.length - 1, target));
            System.out.printf("%d exits in arr:%b \n", target, binarySearch(a, target));
            target++;
        }
    }
}

