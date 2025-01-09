package question;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(numbers[i-1]);
            if (i != 1) {
                System.out.print(", ");
            }
        }
    }
}
