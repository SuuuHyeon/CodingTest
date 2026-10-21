import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 한 번에 한 명의 유저 신고 가능
        // 한 유저 여러 번 신고 가능하지만 횟수를 1회로 처리
        // k번 이상 신고 받으면 정지, 신고한 사람들에게 메일 발송
        // hashmap 사용하면 될 듯
        
        
        // 유저별 신고한 사람들 담을 map
        Map<String, Set<String>> userMap = new HashMap<>();
        
        for(String record: report) {
            String[] str = record.split(" ");
            String reporter = str[0]; // 신고자
            String reportee = str[1]; // 피신고자
            
            if(!userMap.containsKey(reporter)) {
                // 피신고자 담을 중복 안 되는 set
                Set<String> reporteeSet = new HashSet<>();
                reporteeSet.add(reportee);
                userMap.put(reporter, reporteeSet);
            } else {
                userMap.get(reporter).add(reportee);
            }
            
        }
        // 신고당한 사람별 횟수 세는 map
        Map<String, Integer> countMap = new HashMap<>();
        
        for(Set<String> set: userMap.values()) {
            
            for(String reportee: set) {
                countMap.put(reportee, countMap.getOrDefault(reportee, 0) + 1);
            }
        }
        
        // 메일 수 담을 배열
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> emptySet = new HashSet<>();
            Set<String> set = userMap.getOrDefault(user, emptySet);
            
            for(String reportee: set) {
                if(countMap.get(reportee) >= k) answer[i]++;
            }
            
        }
        
        
        
        return answer;
    }
}