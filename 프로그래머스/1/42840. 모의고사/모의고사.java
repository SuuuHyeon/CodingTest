import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = {1,2,3,4,5};           // 1번 패턴
        int[] arr2 = {2,1,2,3,2,4,2,5};     // 2번 패턴
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};  // 3번 패턴
        
        int[][] arr = {arr1, arr2, arr3};
        
        int[] correctArr = {0,0,0};
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < answers.length; j++) {
                // answers[j]랑 arr[i][j % arr[i].length]이 같으면 올리기?
                if(answers[j] == arr[i][j % arr[i].length]) {
                    correctArr[i] += 1;
                }
            } 
        }
        
        int max = Math.max(correctArr[0], Math.max(correctArr[1], correctArr[2]));
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < correctArr.length; i++) {
            if(correctArr[i] == max) {
                // 사람 번호는 1부터
                result.add(i + 1);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}