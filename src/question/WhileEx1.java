package question;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (true) {
            System.out.println("count : " + count);
            if(count >= 10) {
                break;
            }
            count++;
        }
    }
}
