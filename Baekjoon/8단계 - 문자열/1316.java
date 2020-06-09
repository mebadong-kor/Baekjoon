import java.io.*;

/**
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n;

        for (int i = 0; i < n; i++) {
            int[] use = new int[27];
            StringBuilder sb = new StringBuilder(br.readLine());
            boolean groupWord = true;

            for (int j = 0; j < sb.length(); j++) {
                int t = sb.codePointAt(j) - 97;
                if (use[t] == 0) {
                    use[t] = 1;
                } else {
                    if (sb.charAt(j - 1) != sb.charAt(j)) {
                        groupWord = false;
                    }
                }
            }

            if (!groupWord) {
                result--;
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}