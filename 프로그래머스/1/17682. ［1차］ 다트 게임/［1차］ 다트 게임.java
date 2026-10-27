import java.util.*;

class Solution {
    public int solution(String dartResult) {
        
        int[] scoreArr = new int[3]; // 쪼개서 넣을 점수 배열
        int currentIndex = -1; // 배열 인덱스 관리
        List<Character> charList = List.of('S', 'D', 'T', '*', '#');
        for(int i = 0; i < dartResult.length(); i++) {
            
            char c = dartResult.charAt(i);
            // 숫자라면
            if(!charList.contains(c)) {
                currentIndex++;
                if(c == '1') {
                    if(dartResult.charAt(i + 1) == '0') {
                        scoreArr[currentIndex] = 10;
                        i++;
                    } else {
                        scoreArr[currentIndex] = 1;
                    }
                } else {
                    scoreArr[currentIndex] = c - '0';
                }
                
            } else if(c == 'S' || c == 'D' || c == 'T') {
                if(c == 'D') scoreArr[currentIndex] *= scoreArr[currentIndex];
                if(c == 'T') scoreArr[currentIndex] *= scoreArr[currentIndex] * scoreArr[currentIndex];
            } else if(c == '*' || c == '#') {
                if(c == '*') {
                    if(currentIndex == 0) {
                        scoreArr[currentIndex] *= 2;
                    } else {
                        scoreArr[currentIndex - 1] *= 2;
                        scoreArr[currentIndex] *= 2;
                    }
                } else {
                    scoreArr[currentIndex] *= -1;
                }
            }
        }
        
        int answer = 0;
        
        for(int score : scoreArr) {
            answer += score;
        }
        
        return answer;
    }
}