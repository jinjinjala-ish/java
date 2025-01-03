package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grad = 2;
        int coupon;

        switch(grad) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
