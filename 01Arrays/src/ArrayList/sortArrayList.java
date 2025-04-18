package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println(list);
        sortList(list);
        System.out.println(list);

        //collection class sort method

        //Collections.sort(list,Collections.reverseOrder());
        //System.out.println(list);
    }

    public static void sortList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) <= list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
