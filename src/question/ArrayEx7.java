package question;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int studentNumber = scanner.nextInt();

        int[][] grade = new int[studentNumber][3];
        String[] subject = {"국어", "영어", "수학"};

        double average = 0;

        for (int i = 0; i < grade.length; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + "점수: ");
                grade[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < grade.length; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grade[i][j];
            }
            average = (double) sum / 3;
            System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }


    }
}

