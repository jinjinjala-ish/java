package question;

import java.util.Scanner;

public class ScannerSwitchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int total_price = 0;

        while(true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();

           if(option == 1){
                    System.out.print("상품명을 입력하세요: ");
                    String name = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    int total = price * quantity;
                    total_price += total;
                    System.out.println("상품명: " + name + "가격: " + price + "수량: " + quantity + "합계: " + total);
           } else if (option == 2) {
                System.out.println("총 비용: " + total_price);
                total_price = 0;
                System.out.println("결제를 완료했습니다.");
            } else if (option == 3) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
           } else {
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
