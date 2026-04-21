class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1과 cards2에서 하나씩 뽑음
        // goal 앞의 값에 해당하는 값이 있는지 확인
        // 있으면 goal index + 1 사용한 카드뭉치 index + 1
        String answer = "Yes";
        int goalIndex = 0;
        int card1Index = 0;
        int card2Index = 0;
        while (goalIndex < goal.length) {
            String str = goal[goalIndex];
            if (card1Index < cards1.length && cards1[card1Index].equals(str)) {
                goalIndex++;
                card1Index++;
            } else if (card2Index < cards2.length && cards2[card2Index].equals(str)) {
                goalIndex++;
                card2Index++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}