package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("문자를 입력하세요: ");
            String str = scanner.next();

            if (str.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
