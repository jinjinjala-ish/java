package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i < 6) {
            System.out.println("i = " + i);
            if(i == 3) {
                i++;
                continue;
            }
            i++;
        }
    }
}
