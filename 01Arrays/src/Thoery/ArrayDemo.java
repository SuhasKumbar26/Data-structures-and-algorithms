package Thoery;

public class ArrayDemo {
    public static void main(String[] args) {
        // Representation
        int[] ages; // -> address is created and stored in Stack memory
        String[] names;

        // Declaration
        int[] arr = new int[2]; // -> array is stored in HEAP memory.

        // Array literals
        String[] chars = {"Java","Development"};

        // Accessing
        arr[0] = 1;
        arr[1] = 2;
        //arr[2] = 3; Array index out off bound
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // Types of Arrays
        // 1 dimensional
        int[] array = new int[2];

        // 2 dimensional
        int[][] age;

        // Literals
        age= new int[][] {{0, 1, 2}, {4, 5, 6}};

        // accessing

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                System.out.print(age[i][j]+" ");
            }
            System.out.println();
        }

    }
}
