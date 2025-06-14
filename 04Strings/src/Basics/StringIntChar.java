package Basics;

import java.util.Scanner;

public class StringIntChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "abc";
//        s1 = s1 + "def";
//        s1 += 'c';
//        s1 += 10;
        System.out.println(s1+10+20);// abc1020
        System.out.println(20+10+s1); //30abc
        System.out.println(10+20+s1+10+20); //30abc1020

        // subString()
        String str = "abcde";
        System.out.println(str.substring(0,2)); // ab -> last index is excluded 0 -> (idx - 1)
        System.out.println(str.substring(2));

        String gtr = "ABCDE";
        System.out.println(str.equalsIgnoreCase(gtr));
    }
}
