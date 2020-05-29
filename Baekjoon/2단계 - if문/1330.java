import java.util.Scanner;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s;
        s = sc.nextLine().split(" ");

        int a, b;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        sc.close();
    }
}