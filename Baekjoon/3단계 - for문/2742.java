import java.io.*;

/**
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int n = Integer.parseInt(br.readLine()); n >= 1; n--) {
            bw.write(n + "\n");
        }

        bw.flush();
        bw.close();
    }
}