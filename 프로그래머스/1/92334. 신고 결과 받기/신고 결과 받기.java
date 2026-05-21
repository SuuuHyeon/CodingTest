import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        int[] answer = new int[id_list.length];

        // id별로 신고당한 횟수 저장
        Map<String, Integer> reports = new HashMap<>();
        for (String id : id_list) {
            reports.put(id, 0);
        }
        
        for (String r : reportSet) {
            reports.compute(r.split(" ")[1], (key, value) -> value + 1);
        }
        
        // 리포트 순회
        for (String r : reportSet) {
            String[] s = r.split(" ");
            if (reports.get(s[1]) >= k) {
                // 메일 수 추가
                answer[indexOf(id_list, s[0])]++;
            }
        }
        
        return answer;
    }
    
    
    int indexOf(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }
}