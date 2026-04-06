import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine()); // 다솜이 투표 수
        int answer = 0;

        if (N != 1) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 1; i < N; i++) {
                pq.add(Integer.parseInt(br.readLine()));
            }

            while(pq.peek() >= M) {
                int cur = pq.poll();
                cur--;
                M++;
                answer++;
                pq.add(cur);
            }
        }
        System.out.println(answer);
    }
}
