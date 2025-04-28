package Practice.Strings;

public class KeyPadProblem {

    static void combination(String dig, String[] kp, String res){
        if (dig.isEmpty()){
            System.out.print(res + " ");
            return;
        }

        int curNum = dig.charAt(0) - '0';
        String curChoices = kp[curNum];

        for (int i = 0; i < curChoices.length(); i++) { // "abc"
            combination(dig.substring(1), kp, res + curChoices.charAt(i));
        }

    }

    public static void main(String[] args) {
        char ch = '3'; // Ascii = 51
        int ch_val = ch - '0'; // 51 - 48
        System.out.println(ch_val);

        String str = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //             0    1    2      3      4     5       6       7      8       9

        combination(str,kp,"");
    }
}
