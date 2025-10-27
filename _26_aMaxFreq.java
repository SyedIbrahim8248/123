package Javabymanvimaampw.java;
import java.util.*;

public class _26_aMaxFreq {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4,6,2,2};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int mxFreq = 0, ansKey = -1;
        for (var e : freq.entrySet()) {
            if (e.getValue() > mxFreq) {
                mxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);

    }
}


