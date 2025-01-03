package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a == b;
        System.out.println(result);

        String string1 = "문자열1";
        String string2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = string1.equals(string2);

        System.out.println(result1);
        System.out.println(result2);



    }
}
