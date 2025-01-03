package question;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "k";
        System.out.println("grade: " + grade);

        switch(grade){
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            default:
                System.out.println("잘못됨");
                break;
        }
    }
}
