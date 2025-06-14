package Questions;

import java.util.Scanner;
import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            //collect word
            StringBuilder temp = new StringBuilder();
            while(i<str.length() && str.charAt(i) != ' '){
                temp.insert(0,str.charAt(i));
                i++;
            }
            if(i<str.length()-1){
                ans.append(temp).append(" ");
            } else {
                ans.append(temp);
            }
        }
        System.out.println(ans);
    }
}
