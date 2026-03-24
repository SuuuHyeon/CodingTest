import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 확정적으로 입을 수 있는 학생 수
        int answer = n - lost.length;

        // 배열 정렬(차례대로 검사할거라)
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 잃어버리고 여분인 놈
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        
        // 빌려줄 상황 계산
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue;
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == -1) continue;
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }

        }



        return answer;
    }
}