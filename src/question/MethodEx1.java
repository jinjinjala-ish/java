package question;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값: " + add(15, 25, 35));
        System.out.println("평균값: " + add(1, 2, 3));
    }
    public static double add(int a, int b, int c) {
        int sum = a + b + c;
        double average = (double)sum / 3.0;
        return average;
    }
}
