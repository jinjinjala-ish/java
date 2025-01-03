package loop;

public class While_2 {
    public static void main(String[] args) {
       int i = 1;
       int sum = 0;
       int endNum  = 3;

       while(i <= endNum) {
           sum = sum + i;
           System.out.println("i" + i + "sum" + sum);
           i++;
       }

    }
}
