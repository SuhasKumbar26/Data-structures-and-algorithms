package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println(list);
        reversList(list);
        System.out.println(list);

        // collection class reverse()
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void reversList(ArrayList<Integer> list) {
        int i = 0, j = list.size()-1;

        while(i<j){
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
