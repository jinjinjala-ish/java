package question;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");
            int menuNumber = scanner.nextInt();


            if (menuNumber == 1) {
                balance += deposit(balance);
            } else if (menuNumber == 2) {
                balance -= witdraw(balance);
            } else if (menuNumber == 3) {
                check(balance);
            } else if (menuNumber == 4) {
                end();
                break;
            } else {
                System.out.println("정확한 번호를 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return depositAmount;
    }

    public static int witdraw(int balance) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = scanner.nextInt();
        balance -= withdrawAmount;
        if (balance < 0) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return 0;
        } else {
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
            return withdrawAmount;
        }
    }

    public static void check(int balance) {
        System.out.println("현재 잔액은 : " + balance);
    }

    public static void end() {
        System.out.println("프로그램을 종료합니다.");
    }
}
