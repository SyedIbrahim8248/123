package Javabymanvimaampw.java;

public class _18_fquicksortalgo {
    static void displayArr(int[] arr) {}

    static void swap(int[] arr, int x, int y) {}


    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] < pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static  void quickSort(int[]arr ,int st,int end) {
        if(st >= end ) return;
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr , pi+1,end);
    }


    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr , 0,arr.length-1);
            System.out.println("After after sorting");
            displayArr(arr);
    }
}

