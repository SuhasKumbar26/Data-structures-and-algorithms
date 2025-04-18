package ArrayList;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        // Integer n = new Integer(56); // depreciated from java 9 version
        // Integer in = Integer.valueOf(23); // Unnecessary boxing

        Integer i = 9; // wrapper class
        System.out.println(i);

        // Arraylist
        ArrayList<Integer> arrList = new ArrayList<>();

        // add element
        arrList.add(63); // 63
        arrList.add(45); // 63 45
        arrList.add(23); // 63 45 23

        // get element at specific index
        System.out.println(arrList.get(0)); // 63

        // print from for loop
        for (int j = 0; j < arrList.size(); j++) {
            System.out.print(arrList.get(j)+" "); // 63 45 23
        }

        // print from enhanced for loop

        for (Integer integer: arrList){
            System.out.println(integer+" ");
        }

        // print array list Directly
        System.out.println("\n"+arrList); // [63, 45, 23]

        // adding element at some index i
        arrList.add(0,1);
        System.out.println(arrList); // [1, 63, 45, 23]

        // modifying element at index i
        arrList.set(0,100);
        System.out.println(arrList); // [100, 63, 45, 23]

        // removing element at index i
        arrList.remove(2);
        System.out.println(arrList); //[100, 63, 23]

        // removing element
        arrList.remove(Integer.valueOf(100));
        System.out.println(arrList); // [63, 23]

        System.out.println(arrList.remove(Integer.valueOf(32))); // false

        // checking element exists or not
        System.out.println(arrList.contains(26)); // false
        System.out.println(arrList.contains(23)); // True

        // indexOf
        System.out.println(arrList.indexOf(23)); // 1

        arrList.add(23);

        // last indexOf
        System.out.println(arrList.lastIndexOf(23)); // 2

        // isEmpty
        System.out.println(arrList.isEmpty()); // false

        // if you don't specify a class, you can put anything inside
        ArrayList l1 = new ArrayList<>();

        l1.add(12); // int
        l1.add("java"); // string
        l1.add('J'); // char
        l1.add(23.6); // float
        l1.add(true); // boolean

        System.out.println(l1);
        l1.clear();
        System.out.println(l1);

    }
}
