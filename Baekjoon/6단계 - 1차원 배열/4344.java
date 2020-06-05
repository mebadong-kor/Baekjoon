import java.io.*;
import java.util.StringTokenizer;

/**
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int total = 0, up = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int[] score = new int[count];
            total = 0;
            up = 0;
            avg = 0;

            for (int j = 0; j < count; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                total += score[j];
            }

            avg = (double)total / count;

            for (int j = 0; j < count; j++) {
                if (score[j] > avg) {
                    up++;
                }
            }

            bw.write(String.format("%.3f", (double)up / count * 100) + "% \n");
        }

        bw.flush();
        bw.close();
    }
}