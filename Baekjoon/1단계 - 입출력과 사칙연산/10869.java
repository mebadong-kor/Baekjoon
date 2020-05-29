import java.util.Scanner;

/**
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String[] s = sc.nextLine().split(" ");

        int a, b;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        sc.close();
    }
}