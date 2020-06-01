import java.io.*;

/**
 * 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
 * 햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
 * 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] menu = new int[5];

        for (int i = 0; i < 5; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }

        int result = 4000;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                int tmp = menu[i] + menu[4 - j] - 50;
                if (tmp < result) {
                    result = tmp;
                }
            }
        }

        bw.write(result+ "\n");

        bw.flush();
        bw.close();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] menu = new int[5];

        for (int i = 0; i < 5; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }

        int b = 2000, d = 2000;

        for (int i = 0; i < 3; i++) {
            if (menu[i] < b) {
                b = menu[i];
            }
        }
        for (int i = 4; i > 2; i--) {
            if (menu[i] < d) {
                d = menu[i];
            }
        }

        bw.write((b + d - 50) + "\n");

        bw.flush();
        bw.close();
    }
}
// 버거와 음료 중 가장 저렴한 제품을 찾고 세트 메뉴 계산을 하면 반복문이 1번 적게 돌고 덧셈 연산도 적게 수행한다.