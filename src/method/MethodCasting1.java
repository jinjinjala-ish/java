package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
       // printNumber(number); -> 형(타입)이 맞지 않음
        printNumber((int) number); //명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("number: " + n);
    }
}
