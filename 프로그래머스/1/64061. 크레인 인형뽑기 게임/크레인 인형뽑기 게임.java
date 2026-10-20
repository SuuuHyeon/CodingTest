import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // 뽑아서 담을 스택
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        for(int i = 0; i < moves.length; i++) {
            int result = pickNumber(moves[i], board);
            if(result == 0) continue;
            if(deque.isEmpty()) {
                deque.add(result);
            } else {
                // 스택에 들어있던 숫자
                int preNum = deque.peekLast();
                //체크하기
                if(checkSame(preNum, result)) {
                    deque.pollLast();
                    answer += 2;
                } else {
                    deque.add(result);
                }
            }
        }
        return answer;
    }
    
    // 들어온 인형이 같은 건지 체크하는 메서드
    boolean checkSame(int preNum, int num) {
        if(num == preNum) return true;
        return false;
    }
    
    
    int pickNumber(int line, int[][] board) {
        for(int i = 0; i < board.length; i++) {
            int num = board[i][line - 1];
            if(num != 0) {
                board[i][line -1] = 0;
                return num;
            }
        }
        return 0;
    }
}