package Practice;

public class FruitsSort {
    public static void main(String[] args) {
        String[] fruits = {"watermelon","apple","Mango","grapes","kiwi","orange","Cherry","Banana"};

        for (String s : fruits) {
            System.out.print(s+" ");
        }

        sortFruits(fruits);
        System.out.println();

        for (String s : fruits) {
            System.out.print(s+" ");
        }
    }

    private static void sortFruits(String[] fruits) {
        for (int i = 0; i < fruits.length-1 ; i++) {

            int minIdx = i;

            for (int j = i+1; j < fruits.length ; j++) {
                if (fruits[j].compareTo(fruits[i]) < 0){
                    minIdx = j;
                }
            }

            //swap
                String temp = fruits[i];
                fruits[i] = fruits[minIdx];
                fruits[minIdx] = temp;
        }
    }
}
