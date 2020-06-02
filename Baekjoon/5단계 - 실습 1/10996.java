import java.io.*;

/**
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 
 * <예제>
 * * *
 *  * *
 * * *
 *  * *
 * * *
 *  * *
 * * *
 *  * *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2; j++) {
                if (j == n + (n % 2)) sb.append("\n");
                else {
                    if (j <= n) {
                        if (j % 2 != 0) {
                            sb.append("*");
                        } else {
                            sb.append(" ");
                        }
                    } else {
                        if (j % 2 == 0) {
                            sb.append("*");
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}