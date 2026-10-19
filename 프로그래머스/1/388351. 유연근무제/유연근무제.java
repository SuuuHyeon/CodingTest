class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            // 희망 시각 + 10분을 분 단위로 계산
            int limit = toMinute(schedules[i]) + 10;
            boolean success = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday - 1 + j) % 7 + 1;   // 오늘 요일

                // 토요일(6), 일요일(7)은 검사하지 않음
                if (day == 6 || day == 7) {
                    continue;
                }

                // 평일인데 늦었으면 실패
                if (toMinute(timelogs[i][j]) > limit) {
                    success = false;
                    break;
                }
            }

            if (success) {
                answer++;
            }
        }

        return answer;
    }

    // 855 같은 시각을 분 단위로 바꾸는 함수
    public int toMinute(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return hour * 60 + minute;
    }
}