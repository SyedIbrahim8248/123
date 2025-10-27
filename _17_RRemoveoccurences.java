package Javabymanvimaampw.java;
import java .util.*;

public class _17_RRemoveoccurences {
    static String removeA(String s ,int idx){
        //base case
        if(idx == s.length()) return "";
        //recursive work
        String smallAns = removeA(s , idx + 1);
        char currChar = s.charAt(idx);
        //self work
        if(currChar != 'a') {
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String s = Sc.nextLine();
        System.out.println(removeA(s,0));
    }
}
