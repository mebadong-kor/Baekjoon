import java.io.*;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] result = getPoint(br.readLine());

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }

        bw.flush();
        bw.close();
    }

    public static int[] getPoint(String str) {
        StringBuilder sb = new StringBuilder(str);
        int[] result = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int tmp;

        for (int i = 0; i < sb.length(); i++) {
            tmp = sb.codePointAt(i) - 97;
            if (result[tmp] == -1) {
                result[tmp] = i;
            }
        }  

        return result;
    }
}