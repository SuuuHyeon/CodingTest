import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 1. 스테이지별로 멈춰 있는 사람 수 세기
        int[] count = new int[N + 2];
        for (int s : stages) {
            count[s]++;
        }

        // 2. 스테이지별 실패율 계산
        double[] rate = new double[N + 1];
        int reached = stages.length;   // 1번 스테이지에는 모두 도달함

        for (int i = 1; i <= N; i++) {
            if (reached == 0) {
                rate[i] = 0;           // 도달한 사람이 없으면 실패율 0
            } else {
                rate[i] = (double) count[i] / reached;
            }
            reached -= count[i];       
        }

        Integer[] order = new Integer[N];
        for (int i = 0; i < N; i++) {
            order[i] = i + 1;
        }
        Arrays.sort(order, (a, b) -> Double.compare(rate[b], rate[a]));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = order[i];
        }
        return answer;
    }
}