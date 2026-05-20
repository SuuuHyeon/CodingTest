class Solution {
    int maxDungeons = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        // 피로도, 던전, 카운트 수 넘기기
        dfs(k, dungeons, 0);
        
        return maxDungeons;
    }

    
    
    void dfs(int k, int[][] dungeons,int cnt) {
        maxDungeons = Math.max(maxDungeons, cnt);
        
        for(int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                
                dfs(k - dungeons[i][1], dungeons, cnt + 1);
                
                visited[i] = false;
            }
        }
    }
}