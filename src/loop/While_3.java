package loop;

public class While_3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while(true) {
            sum = sum + i;
            if (sum == 10) {
                System.out.println("합이 10보다 큼, 종료" + "sum = " + sum + "i = " + i);
                break;
            }
            i++;
        }
    }
}
