import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int headCount = stages.length; // 사람 수
        // 라운드별 멈춰있는 사람 수 세기
        Map<Integer, Integer> stageMap = new HashMap<>();
        for(int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            // stage별로 1씩 추가하기. stage 없으면 기본값 0에 1더해서 넣기
            stageMap.put(stage, stageMap.getOrDefault(stage, 0) + 1);
        }
        // ex) 1:1, 2:3, 3:2 ---
        // 스테이지별 실패율 구하기
        // 실패율 담을 배열
        double[] failPercentage = new double[N];
        // 유리수가 double써야할듯
        double currentHeadCount = stages.length;
        for(int i = 0; i < N; i++) {
            // 얘도 마찬가지
            double count = stageMap.getOrDefault(i+1, 0);
            if(count == 0) {
                failPercentage[i] = 0;
            } else {
                failPercentage[i] = count / currentHeadCount;
                currentHeadCount -= count;
            }
        }
        
        // Integer로 만들어야 comparator메서드를 사용할 수 있음
        Integer[] totalStage = new Integer[N];
        for(int i = 0; i < N; i++) {
            totalStage[i] = i + 1;
        }
        
        Arrays.sort(totalStage, (a,b) -> {
            // 실패율 가져와서 비교해야함
            double rateA = failPercentage[a - 1];
            double rateB = failPercentage[b - 1];
            if(rateA != rateB) return Double.compare(rateB, rateA);
            return a.compareTo(b);
            
        });
        
        int[] answer = new int[N];
        
        for(int i = 0; i < totalStage.length; i++) {
            answer[i] = totalStage[i];
        }
        
        
        // --- 일단 여기까지는 맞나? 수정해봤는데 N을 안썼더라고 ---
        // 여기 밑은 어떻게 해야할지 감이 안오네
        
        
        // 이제 라운드별 실패율이 나왔음 ex) [1/8, 3/7, 2/4 --]
        // 스테이지별 확률 map을 또 만드나?
//         Map<Double, Integer> stageFailure = new HashMap<>();
//         for(int i = 0; i < failPercentage.length; i++) {
//             // ex) 1 : 1/8, 2 : 3/7 --
//             stageFailure.put(failPercentage[i], i + 1);
//         }
//         // 실패율 내림차순으로 정렬하고 stageFailure이랑 비교해서 키값 가져와서 배열로 만들어가지고 return하기
//         Arrays.sort(failPercentage, Collections.reverseOrder());
//         int[] answer = new int[stages.length];
//         for(int i = 0; i < failurePercentage.length; i++) {
//             answer[i] = stageFailure.get(failPercentage[i]);
//         }
        //
        
        
        
        return answer;
    }
}