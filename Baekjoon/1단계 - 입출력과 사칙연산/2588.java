import java.util.Scanner;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        String[] s;

        i = Integer.parseInt(sc.nextLine());
        s = sc.nextLine().split("");

        int tmp1, tmp2, tmp3, result;
        tmp1 = Integer.parseInt(s[2]) * i;
        tmp2 = Integer.parseInt(s[1]) * i;
        tmp3 = Integer.parseInt(s[0]) * i;

        result = tmp1 + (tmp2 * 10) + (tmp3 * 100);

        System.out.println(tmp1);
        System.out.println(tmp2);
        System.out.println(tmp3);
        System.out.println(result);
    }
}