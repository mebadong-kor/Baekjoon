import java.util.Scanner;

/**
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}