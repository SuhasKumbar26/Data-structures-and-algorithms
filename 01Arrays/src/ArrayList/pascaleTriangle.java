package ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class pascaleTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        List<List<Integer>> list = generatePascal(n);
        System.out.println(list);
    }
    public static List<List<Integer>> generatePascal(int n){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List <Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ){
                    row.add(1);
                }
                else {
                    int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    row.add(val);
                }
            }
            list.add(row);
        }
        return list;
    }
}
