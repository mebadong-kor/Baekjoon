import java.io.*;

/**
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = getAP(Integer.parseInt(br.readLine()));

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }

    public static int getAP(int n) {
        int cnt = 0;
        int gap;
        boolean isAP;

        for (int i = 1; i <= n; i++) {
            isAP = true;
            if (i >= 10) {
                String[] number = Integer.toString(i).split("");

                gap = Integer.parseInt(number[0]) - Integer.parseInt(number[1]);

                for (int j = 1; j < number.length; j++) {
                    if ((Integer.parseInt(number[j - 1]) - Integer.parseInt(number[j])) != gap) {
                        isAP = false;
                    }
                }
            }

            if (isAP) {
                cnt++;
            }
        }

        return cnt;
    }
}