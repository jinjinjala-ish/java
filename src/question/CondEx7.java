package question;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 9;

        String even = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + x);
        System.out.println("x는 " + even + "입니다.");
    }
}
