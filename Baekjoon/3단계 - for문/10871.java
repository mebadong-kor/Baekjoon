import java.io.*;
import java.util.StringTokenizer;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()),
            x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int a;

        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(st.nextToken());

            if (x > a) {
                sb.append(a + " ");
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}