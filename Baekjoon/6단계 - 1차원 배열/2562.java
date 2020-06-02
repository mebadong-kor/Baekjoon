import java.io.*;

/**
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -99999,
            maxIndex = 0,
            value;

        for (int i = 1; i <= 9; i++) {
            value = Integer.parseInt(br.readLine());
            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }

        bw.write(max + "\n" + maxIndex);

        bw.flush();
        bw.close();
    }
}
// 배열 이용 X, 메모리 13032kb, 72ms

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[] = new int[9];
        int max = 0, index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        bw.write(max + "\n" + index);

        bw.flush();
        bw.close();
    }
}
// 배열 이용, 메모리 12936kb, 76ms