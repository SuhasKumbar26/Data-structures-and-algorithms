package Practice.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "jav a vaj";

        //boolean ans = isPalindrome(str,0,str.length()-1);

        if (isPalindromeWithoutPointer(str)) System.out.println("YES");
        else System.out.println("NO");
    }

    /*
    public static boolean isPalindrome(String s, int l, int r){
        //base case
        if (l == r) return true;

        //self work
        if (s.charAt(l) != s.charAt(r)) return false;

        //recursive work
        return isPalindrome(s, l+1, r-1);
    }
    */

    //without pointer
    public static boolean isPalindromeWithoutPointer(String s){
        //base case
        if (s.length() <= 1) return true;

        //self work
        if (s.charAt(0) != s.charAt(s.length()-1)) return false;

        //recursive work
        return isPalindromeWithoutPointer(s.substring(1,s.length()-1));
    }

}
