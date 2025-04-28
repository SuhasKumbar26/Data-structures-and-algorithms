package Practice.Strings;

import java.util.ArrayList;

public class subSequence {

    public static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if (str.isEmpty()){
            ans.add("");
            return ans;
        }

        //recursive work
        ArrayList<String> smallAns = getSSQ(str.substring(1)); // ["bc","b","c",""]

        //self-work ["bc","b","c","","abc","ab","ac","a"]
        char curChar = str.charAt(0);//a
        for (String ss: smallAns){
            ans.add(curChar+ss);
            ans.add(ss);
        }

        return ans;
    }

    private static void printSubSequence(String str,String curAns) {
        //base case
        if (str.isEmpty()){
            System.out.print(curAns+" ");
            return;
        }

        //recursive work
        char curr = str.charAt(0);
        String remString = str.substring(1);

        //self work
        printSubSequence(remString,curAns + curr); // add current char
        printSubSequence(remString,curAns); // don't add current char

    }

    public static void main(String[] args) {
        String str = "suhas";

        //ArrayList<String> list = getSSQ(str);
        //System.out.println(list);

        printSubSequence(str,"");
    }
}
