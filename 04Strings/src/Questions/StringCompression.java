package Questions;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            } else {
                ans.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        ans.append(str.charAt(str.length()-1));
        System.out.println(ans);
    }
}
