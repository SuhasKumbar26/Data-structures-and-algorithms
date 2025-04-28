package Practice.Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println(s);

        for (char c : s.toCharArray()){
            System.out.print(c+":");
        }
        // college
        // 0123456
        System.out.println("\nSubStr: "+s.substring(2,7)); //(first:inclusive ,last:Exclusive)
    }
}
