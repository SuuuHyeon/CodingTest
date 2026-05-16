import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
    
        // 배열에서 숫자 3개 뽑는 방법 수
        // int pickCount = 0;
        // int mul = 1;
        // for(int i = 1; i < nums.length; i++) {
        //     mul *= i;
        // }
        // pickCount = mul / 6;
        
        
        // 3개씩 뽑은 숫자 리스트
        List<int[]> numsList = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1; j < nums.length - 1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int[] newArr = new int[]{nums[i], nums[j], nums[k]};
                    numsList.add(newArr);
                }
            }
        }
        // for(int i = 0; i < numsList.size(); i++) {
        //     System.out.println(Arrays.toString(numsList.get(i)));
        // }
        
        answer = numsList.size();
        
        
        // 숫자 3개 더한 수가 소수인지 판별
        for(int[] arr : numsList) {
            int sum = arr[0] + arr[1] + arr[2];
            
            for(int i = 2; i <= sum - 1; i++) {
                if((sum % i == 0)){
                  answer--;  
                  break;  
                } 
                
            }
            
        }

        
        
        return answer;
    }
}