package question;

public class ForEx5 {
    public static void main(String[] args) {
        int rows = 4;

        for(int j = 1; j <= rows; j++) {
            for(int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
