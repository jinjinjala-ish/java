package question;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        /*for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("가장 작은 정수: " + numbers[0]);
        System.out.println("가장 큰 정수: " + numbers[count - 1]);*/
        int minNumber, maxNumber;

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < count; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
