import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] isNotPrime = new boolean[n + 1];
        
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (isNotPrime[i]) continue;
            
            for (int j = i * i; j <= n; j += i) {
                isNotPrime[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (!isNotPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}