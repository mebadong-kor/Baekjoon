import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 1 + i; j < 3; j++) {
                if (num[i] > num[j]) {
                    int tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }
        }

        bw.write(num[1] + "\n");

        bw.flush();
        bw.close();    
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        bw.write(num[1] + "\n");

        bw.flush();
        bw.close();
    }
}
// Arrays 클래스의 sort()를 이용하는 것과 직접 구현하는 것과 거의 차이가 없음.
// 굳이 구현해야 하는 상황이 아니면 만들어져 있는 자료구조를 쓰는 것이 코드도 짧아지고 보기도 좋음