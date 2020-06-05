import java.io.*;

/**
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int addScore = 1, score = 0;
        String[] result;

        for (int i = 0; i < n; i++) {
            score = 0;
            addScore = 1;

            result = br.readLine().split("");

            for (int j = 0; j < result.length; j++) {
                if (result[j].equals("O")) {
                    score += addScore;
                    addScore++;
                } else {
                    addScore = 1;
                }
            }

            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
    }
}