import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        

        bw.write(arr[0] + " " + arr[n - 1]);

        bw.flush();
        bw.close();
    }
}
// 사용 메모리 129920kb, 소요 시간 988ms

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        sort(arr, 0, n - 1);

        bw.write(arr[0] + " " + arr[n - 1]);

        bw.flush();
        bw.close();
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);

            sort(arr, left, p - 1);
            sort(arr, p + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot, tmp;
        int low, high;

        low = left;
        high = right + 1;
        pivot = arr[left];

        do {
            do {
                low++;
            } while (low <= right && arr[low] < pivot);

            do {
                high--;
            } while (high >= left && arr[high] > pivot);

            if (low < high) {
                tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
            }
        } while (low < high);

        tmp = arr[left];
        arr[left] = arr[high];
        arr[high] = tmp;

        return high;
    }
}
// 사용 메모리 121936kb, 소요 시간 568ms

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tmp;

        int max = -9999999, min = 9999999;

        for (int i = 0; i < n; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < min) {
                min = tmp;
            }
        }

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
    }
}
// 사용 메모리 117932kb, 소요 시간 452ms