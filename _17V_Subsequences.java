package Javabymanvimaampw.java;
/*
public class _17V_Subsequences {
    static ArrayList<String> getSSQ(String s) {
        Arraylist<String> ans = new ArrayList<>();
        //base case
        if(s.length() == 0) {
            ans.add("");
            return ans ;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for(String ss:  smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;

    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss : ans) {
            System.out.println(ss);
        }
    }
}
*/