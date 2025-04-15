package Practice.TargetSum;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.printf("Before swapping: a=%d b=%d\n",a,b);
        int temp = a;
        a =  b;
        b = temp;
        System.out.printf("After swapping: a=%d b=%d\n",a,b);

        // swap without temporary variable
        int x = 10; // 10;
        int y = 20; // 20;
        System.out.printf("Before swapping: x=%d y=%d\n",x,y);
        x = x + y; // 30;
        y = x - y; // 10;
        x = x - y; // 20;
        System.out.printf("After swapping: x=%d y=%d\n",x,y);
    }
}
