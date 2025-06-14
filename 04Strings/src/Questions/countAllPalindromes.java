package Questions;

import java.util.Scanner;

public class countAllPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);

        // substring
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String s = sb.substring(i,j);
                //System.out.print(s+" ");
                if(isPalindrome(s)){
                    count++;
                }
            }
        }

        System.out.print(count);
    }

    private static boolean isPalindrome(String s) {
        int i=0; int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
