package question;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[10];
        int[] productPrices = new int[10];

        int productCount = 0;
        int option;

        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        while(true) {
            System.out.print("메뉴를 선택하세요: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.next();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                productCount++;
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
            }
            else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
            }
            else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
