import java.io.*;
import java.util.StringTokenizer;

/**
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(br.readLine());
        int a, b, c, d, i = 1;
        if (start >= 10) {
            a = start / 10;
            b = start % 10;
            c = a + b;
        } else {
            a = 0;
            b = start;
            c = a + b;
        }

        while ((d = (b * 10) + (c % 10)) != start) {
            if (d >= 10) {
                a = d / 10;
                b = d % 10;
                c = a + b;
            } else {
                a = 0;
                b = d;
                c = a + b;
            }
            i++;
        }

        bw.write(i + "\n");

        bw.flush();
        bw.close();
    }
}
// do-while문을 생각 안 함...

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(br.readLine());
        int a, b, c, d = start, i = 0;
        
        do {
            a = d / 10;
            b = d % 10;
            c = a + b;
            d = (b * 10) + (c % 10);
            i++;
        } while (d != start);

        bw.write(i + "\n");

        bw.flush();
        bw.close();
    }
}
// do-while문을 적용시켰고, start가 10 이하일 경우의 조건문은 필요 없는 조건문으로 제거해 줌
// 코드 길이가 줄어들었고 메모리 사용량과 시간이 아주 조금 줄어듦