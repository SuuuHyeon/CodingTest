class Solution {
    public int[] solution(int brown, int yellow) {
        
        // 좌표로 생각하기. 좌상단을 0,0으로 잡고 ? x
        // 길이로 생각하기
        // 갈색 가로는 bx, 세로은 by 노랑 가로는 bx - 2, 세로는 by - 2
        // bx * by = brown
        // (bx - 2) * (by - 2) = yellow
        
        int total = brown + yellow; // 전체 타일 수
        
        for(int h = 3; ; h++) {
            // 높이를 h라 두고 3부터 올려보기
            
            // 안 나눠떨어지면 다음 높이로
            if(total % h != 0) continue;
            
            int w = total / h; // 너비
            
            if((h - 2) * (w - 2) == yellow) return new int[]{w, h};
            
        }
    }
}