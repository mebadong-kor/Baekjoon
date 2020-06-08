import java.io.*;

/**
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(getASCII(br.readLine())));

        bw.flush();
        bw.close();
    }

    public static int getASCII(String str) {
        StringBuilder st = new StringBuilder(str);

        return st.codePointAt(0);
    }
}