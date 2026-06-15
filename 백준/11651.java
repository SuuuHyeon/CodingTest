import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x
            arr[i][1] = Integer.parseInt(st.nextToken()); // y
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0]; // x 오름차순
            }
            return a[1] - b[1];     // y 오름차순
        });

        StringBuilder sb = new StringBuilder();

        for (int[] p : arr) {
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }

        System.out.print(sb);
    }
}