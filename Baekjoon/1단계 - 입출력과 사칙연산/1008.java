import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String[] s = sc.nextLine().split(" ");

        System.out.println(Double.parseDouble(s[0]) / Double.parseDouble(s[1]));

        sc.close();
    }
}