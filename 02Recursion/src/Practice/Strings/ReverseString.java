package Practice.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Suhas Kumbar";

        System.out.println("Reversed str: "+reverseStr(str));

    }
    public static String reverseStr(String s){
        //base case
        if (s.isEmpty()) return " ";

        //recursive work
        String smallWork = reverseStr(s.substring(1));

        //selfWork
        return smallWork + s.charAt(0);
    }

}
