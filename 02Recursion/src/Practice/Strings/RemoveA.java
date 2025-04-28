package Practice.Strings;

public class RemoveA {
    public static void main(String[] args) {
        String str = "Suhas";

        System.out.println("Str: "+removeAll(str,0));
    }

    private static String removeA(String str, int i) {
        //base case
        if (i == str.length()) return "";

        //recursive work
        String smallAns = removeA(str,i+1);

        //self work
        if (str.charAt(i) != 'a'){
           return str.charAt(i) + smallAns; // O(n)
        } else {
            return smallAns;
        }

    }

    private static String removeAll(String str, int i) {
        //base case
        if (i == str.length()) return "";

        String s = "";
        //self work
        if (str.charAt(i) != 'a'){
            s += str.charAt(i);
        }

        //recursive work
        String smallAns = removeAll(str,i+1);
        return s+smallAns;

    }
}
