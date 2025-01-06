package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        for (int i = 0; i < students.length; i++) { //students.length = 배열의 길이
            System.out.println("학생 " + (i+1) + "의 점수: " + students[i]);
        }
    }
}
