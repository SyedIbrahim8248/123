package Javabymanvimaampw.java;
import java .util.*;

public class _25_FMapInterFaceExamples {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3,"Ibrahim");
        mp.put(1,"Hasan");
        mp.put(2,"Hussain");
        mp.put(1,"Ahmad");//over rides
        mp.putIfAbsent(1,"Hasan");
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp);
      /*  System.out.println(mp.get(2));//hussain
        System.out.println(mp.containsKey(4));//fasle
        System.out.println(mp.containsValue("Hussain"));//true*/
    }
}
