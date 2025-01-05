package question;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int user_num = input.nextInt();

        System.out.println(user_num + "단의 구구단: ");

        for (int i = 1; i < 10; i++) {
            int result = user_num * i;
            System.out.println(user_num + " * " + i + " = " + result);

        }
    }
}
