import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        //System.out.println(s);

        StringBuilder sb = new StringBuilder();
        String ans = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'x') sb.append("a");
            else if(s.charAt(i) == 'y') sb.append("b");
            else if(s.charAt(i) == 'z') sb.append("c");
            else{

                char c = (char)((int)s.charAt(i)+3) ;
                sb.append(c);
            }
        }

        System.out.print(sb.toString());

        //System.out.println((char)((int) 'd'-3));

    }
}