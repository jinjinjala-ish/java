package question;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int num = 0;
        int sum = 0;
        int count = 0;

        /*while (true) {
            num = input.nextInt();

            if (num == -1) {
                double average = 0;
                average =(double) sum / count;

                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입력한 숫자들의 평균: " + average);
                break;
            }
            sum += num;
            count++;


        }*/

        while ((num = input.nextInt()) != -1) {
            sum += num;
            count++;
        }
        double average = (double)sum / count;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
