import java.util.*;

class Solution {
    List<Integer>[] graph;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        this.graph = new ArrayList[n];
        this.visited = new boolean[n];
        int answer = 0;
        
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[0].length; j++) {
                if(computers[i][j] == 1 && i != j) {
                    graph[i].add(j);
                }
            }
        }
        // for(int i = 0; i < graph.length; i++) {
        //     System.out.println(i + " : " + graph[i]);
        // }
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        
        return answer;
    }
    
    
    void dfs(int now) {
        visited[now] = true;
        for(int next : graph[now]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}