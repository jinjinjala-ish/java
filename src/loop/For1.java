package loop;

public class For1 {
    public static void main(String[] args) {
        int endNum = 10;
        int sum = 0;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + "  sum = " + sum);
        }
    }
}
