package question;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 150;
        System.out.println("distance: " + distance);
        if(distance <= 1) {
            System.out.println("출력: 도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("출력: 자전거 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("출력: 자동차 이용하세요.");
        } else {
            System.out.println("출력: 비행기 이용하세요.");
        }
    }
}
