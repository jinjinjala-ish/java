package question;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        print(message, 3);
        System.out.println();
        print(message, 5);
        System.out.println();
        print(message, 7);
    }

    public static void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
