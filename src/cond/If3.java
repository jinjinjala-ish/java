package cond;

public class If3 {
    public static void main(String[] args) {
        int price = 1000;
        int age = 11;
        int discount = 1000;

        if (price >= 10000) {
            if (age <= 10) {
                discount = 2000;
                System.out.println("price: " + (price - discount));
            }
            else {
                System.out.println("pircd: " + (price - discount));
            }
        }
        else if (price < 10000) {
            if (age <= 10) {
                System.out.println("price: " + (price - discount));
            }
            else {
                System.out.println("price: " + price);
            }
        }
    }
}

