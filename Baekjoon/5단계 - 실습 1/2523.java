import java.io.*;

/**
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1 - i; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = i - (((i / n) * (i % n)) * 2); j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
// 짧지만 더 느리다.