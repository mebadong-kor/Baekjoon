import java.io.*;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        bw.write(String.valueOf(getSum(n, str)));

        bw.flush();
        bw.close();
    }

    public static int getSum(int n, String str) {
        String[] s = str.split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(s[i]);
        }

        return sum;
    }
}