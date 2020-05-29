import java.util.Scanner;
/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        sc.close();
    }
}
// 시간 104ms, 메모리 14296 KB

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.nextInt() + sc.nextInt());

        sc.close();
    }
}
// 시간 104ms, 메모리 14312 KB

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String s = sc.nextLine();

        System.out.println(Integer.parseInt(s.split(" ")[0]) + Integer.parseInt(s.split(" ")[1]));

        sc.close();
    }
}
// 시간 100ms, 메모리 14260 KB

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String[] s = sc.nextLine().split(" ");

        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));

        sc.close();
    }
}
// 시간 100ms, 메모리 14276 KB

// 76ms이 소요된 다른 사람의 코드를 보니 Scanner를 사용한 것이 아닌 BufferedReader를 사용하였다.
// Scanner는 구현이 쉽지만 읽어오는 시간이 길다는 단점이 있고
// BufferedReader는 어렵지만 읽어오는 시간이 빠르다는 장점이 있다. 또한 사용된 메모리도 내 코드는 14260 KB 수준이었는데
// BufferedReader를 사용한 코드는 13020 KB 였다.
// BufferedReader를 사용하는게 알고리즘에서는 더 효율적일 것 같다.