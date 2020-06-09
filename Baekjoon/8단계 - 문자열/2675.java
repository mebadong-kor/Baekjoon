import java.io.*;
import java.util.StringTokenizer;

/**
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
 * S에는 QR Code "alphanumeric" 문자만 들어있다.
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            bw.write(getNewString(repeat, str) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static String getNewString(int repeat, String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder nsb = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < repeat; j++) {
                nsb.append(sb.charAt(i));
            }
        }

        return nsb.toString();
    }
}