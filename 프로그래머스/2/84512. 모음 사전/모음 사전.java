import java.util.*;

class Solution {
    // 각 알파벳들
    final String[] eachWord = {"A", "E", "I", "O", "U"};
    List<String> arr = new ArrayList<>();

    public int solution(String word) {
        dfs("");
        // 그대로 순번
        return arr.indexOf(word);
    }

    private void dfs(String cur) {
        arr.add(cur);
        if (cur.length() == 5) return;
        for (String s : eachWord) {
            dfs(cur + s);
        }
    }
}