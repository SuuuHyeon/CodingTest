import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (a,b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1]; 
        });
        
        int end = -1;
        
        for(int[] t: targets) {
            int s = t[0];
            int e = t[1];
            if( end <= s) {
                answer++;
                end = e;
            }
        }
        
        
        return answer;
    }
}