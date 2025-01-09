package method;

public class Method1 {
    public static void main(String[] args) {
 /*       int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " = " + (a+b));*/

   /*     int x = 10;
        int y = 20;
        System.out.println(x + " + " + y + " = " + (x+y));*/

        int sum1 = add(1, 2);
        System.out.println("결과 1: " + sum1);

        int sum2 = add(10, 20);
        System.out.println("결과 2: " + sum2);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
