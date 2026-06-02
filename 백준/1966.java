import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                queue.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while(!queue.isEmpty()) {
                int[] front = queue.poll(); // 앞에 뽑기

                boolean isMax = true;
                for(int[] q : queue) {
                    if(q[1] > front[1]) {
                        isMax = false;
                        break;
                    }
                }

                if(!isMax) {
                    queue.offer(front);
                } else {
                    count++;
                    if(front[0] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
