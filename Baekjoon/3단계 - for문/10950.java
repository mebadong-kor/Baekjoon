import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] in;
        int a, b, n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            in = sc.nextLine().split(" ");

            a = Integer.parseInt(in[0]);
            b = Integer.parseInt(in[1]);

            System.out.println(a + b);
        }

        sc.close();
    }
}