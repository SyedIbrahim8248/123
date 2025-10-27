package Javabymanvimaampw.java;
import java.util.*;

public class _26HashMap {
    static void HashMapMethods(){
        Map<String , Integer> mp = new HashMap<>();
        mp.put("Ibrahim", 21);
        mp.put("Hasan", 16);
        mp.put("Hussian",17);
        mp.put("Ahmad",19);
        mp.put("Mohd",18);
        System.out.println(mp.get("Hasan"));//16
        System.out.println(mp.get("Anjar"));//null
        mp.put("Ibrahim",25);
        System.out.println(mp.get("Ibrahim"));
        System.out.println(mp.remove("Ibrahim"));//25
        System.out.println(mp.remove("Imran"));//null
        System.out.println(mp.containsKey("Ibrahim"));//false
        System.out.println(mp.containsKey("Hasan"));//true
        mp.putIfAbsent("Abdullah",30);// will enter
        mp.putIfAbsent("Ibrahim",30);//will not enter
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
