package question;

public class CondEx4 {
    public static void main(String[] args) {
        double rating = 6;

        System.out.println("rating: " + rating);
      if(rating <= 9) {
          System.out.println("어바웃타임을 추천합니다.");
      }
      if(rating <= 8) {
          System.out.println("토이스토리을 추천합니다.");
      }
      if(rating <= 7) {
          System.out.println("고질라을 추천합니다.");
      }
    }
}
