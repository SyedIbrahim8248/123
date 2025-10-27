package Javabymanvimaampw.java;

public class _19_GDistributechocolates {
   static   boolean isDivisiblePossible(int[] a ,int n,int mxChocAllowed) {
       int numOfStudents = 1;
       int choc = 0;
       for (int i = 0; i < a.length; i++) {
           if (a[i] > mxChocAllowed) return false;
           if (choc + a[i] <= mxChocAllowed) {
               choc += a[i];
           } else {
               numOfStudents++;
               choc = a[i];
           }
       }
       return numOfStudents <= n;
       // if(numOfstudents > n) return false;
       //return true;
   }
    static int distributeChocolates(int[] a,int n){
        if(a.length < n )return -1;
        int ans = 0, st = 1,end = (int)1e9;
        while(st <= end) {
            int mid = st + (end -st)/2;
            if(isDivisiblePossible(a ,n, mid)){
                ans = mid;
                end = mid - 1;
            } else{
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {5,3,1,4,2};
        int n = 3;
        System.out.println(distributeChocolates(a ,n));

    }
}
































