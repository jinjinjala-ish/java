package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("첫번째와 두번째 모두 0일시 종료");
            System.out.print("첫번째 숫자 입력: ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자 입력: ");
            int num2 = scanner.nextInt();


            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            int sum = num1 + num2;
            System.out.println("입력한 값의 합은: " + sum);
        }
    }
}
