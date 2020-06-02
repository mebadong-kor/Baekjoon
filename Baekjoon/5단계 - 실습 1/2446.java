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

        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < i - ((i - (n - 1)) * 2 * (i / n)); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < (2 * n) - (1 + (2 * (i - ((i - (n - 1)) * 2 * (i / n))))); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}