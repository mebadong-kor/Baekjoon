import java.io.*;

/**
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int i = 1, t = 1;
        int denominator = 1, numerator = 1;

        while (t < n) {
            i++;
            t += i;
        }

        if (i % 2 == 0) {
            numerator = n - (t - i);
            denominator = (i + 1) - numerator;
        } else {
            denominator = n - (t - i);
            numerator = (i + 1) - denominator;
        }

        bw.write(numerator + "/" + denominator);

        bw.flush();
        bw.close();
    }
}