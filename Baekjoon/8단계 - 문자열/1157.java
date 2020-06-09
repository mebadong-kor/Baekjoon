import java.io.*;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(getAlphabet(br.readLine().toLowerCase()));

        bw.flush();
        bw.close();
    }

    public static char getAlphabet(String str) {
        StringBuilder sb = new StringBuilder(str);
        int[] count = new int[26];
        char a;
        int max = -1, index = 0;
        boolean isOnly = true;

        for (int i = 0; i < sb.length(); i++) {
            count[sb.codePointAt(i) - 97]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
                isOnly = true;
            } else if (count[i] == max) {
                isOnly = false;
            }
        }

        if (isOnly) {
            a = (char)(index + 65);
        } else {
            a = '?';
        }

        return a;
    }
}