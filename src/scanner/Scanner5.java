package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("0을 입력하면 프로그램 종료");

            System.out.print("숫자를 입력하세요: ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("총 합은 : " + sum);
    }
}
