package Questions;
import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.setCharAt(i,Character.toUpperCase(ch));
            } else{
                sb.setCharAt(i,Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);

    }
}
