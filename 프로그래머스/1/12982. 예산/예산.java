import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int priceSum = 0;
        int answer = 0;
        for (int price : d) {
            priceSum += price;
            if (priceSum <= budget) {
                answer++;
            } else {
                return answer;
            }
            
        }

        return answer;
    }
}