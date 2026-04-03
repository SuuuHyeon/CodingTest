import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String str = sc.next();

        int answer = 0;

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int startIndex = Math.max(i - K, 0);
            int lastIndex = Math.min(i + K, N - 1);
            char target = arr[i];

            for (int j = startIndex; j <= lastIndex; j++) {
                if (target == 'P' && arr[j] == 'H')  {
                    arr[j] = '0';
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);


    }
}
