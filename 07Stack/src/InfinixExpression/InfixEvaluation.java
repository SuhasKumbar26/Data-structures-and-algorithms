package InfinixExpression;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        int ans = evaluvate(str);
        System.out.println("Ans: "+ans);

        String str1 = "(9-5)+3*4/6";
        int ans1 = parenthesisEvaluate(str1);
        System.out.println("Ans parenthesis: "+ ans1);
    }

    private static int parenthesisEvaluate(String str){
        Stack<Integer> num = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for(char ch : str.toCharArray()){
            // Number
            if (ch >= 48 && ch <= 57) num.push(ch-48);
            else{
                // Operator
                if(opr.isEmpty() || ch == '(' || opr.peek() == '(') opr.push(ch);
                else if( ch == ')'){
                    while (opr.peek() != '('){
                        int v2 = num.pop();
                        int v1 = num.pop();
                        char op = opr.pop();
                        num.push(applyOpr(v1,v2,op));
                    }
                    opr.pop();
                }
                else {
                    // + , - , /, * ;
                    while (!opr.isEmpty() && priority(opr.peek()) >= priority(ch)){
                        int v2 = num.pop();
                        int v1 = num.pop();
                        char op = opr.pop();
                        num.push(applyOpr(v1,v2,op));
                    }
                    opr.push(ch);
                }
            }
        }

        while (!opr.isEmpty()){
            int v2 = num.pop();
            int v1 = num.pop();
            char op = opr.pop();
            num.push(applyOpr(v1,v2,op));
        }

        return num.pop();
    }


    private static int evaluvate(String str) {
        Stack<Integer> num = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch >= 48 && ch <= 57){
                num.push(ch-48);
            }else {
                // its operator
                if(opr.isEmpty()) opr.push(ch);
                else{
                    while (!opr.isEmpty() && priority(opr.peek()) >= priority(ch)){
                        int v2 = num.pop();
                        int v1 = num.pop();
                        char op = opr.pop();
                        num.push(applyOpr(v1,v2,op));
                    }
                    opr.push(ch);
                }
            }
        }

        while (!opr.isEmpty()){
            int v2 = num.pop();
            int v1 = num.pop();
            char op = opr.pop();
            num.push(applyOpr(v1,v2,op));
        }
        return num.pop();
    }

    private static int applyOpr(int a, int b, char opr) {
        return switch (opr) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }

    private static int priority(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}
