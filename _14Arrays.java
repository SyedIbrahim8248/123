package Javabymanvimaampw.java;

public class _14Arrays {
    public static void main(String[] args) {
        int [] ages = new int [3];
        float[] weights = new float[3];
        String[] names = new String[3];
        ages[0] = 25;
        ages[1] = 30;
        ages[2] = 24;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        for(int i = 0; i < 3; i++){
            System.out.println(ages[i]);

        }
        int[][] arr2 ={{56,43,6,},{34,7,8},{12,56,8}};
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[2][1]);
        String[] names2 = {"ibrahim","hasan","hussain"};
        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);
        int[] arr = {1,4,5,6,1};
                int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            System.out.println(sum);
        }
        System.out.println();
        


    }

}

