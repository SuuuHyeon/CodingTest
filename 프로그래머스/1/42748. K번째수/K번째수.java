import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int a = 0; a < answer.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            // 배열 자르기
            int[] rangeArr = Arrays.copyOfRange(array, i - 1, j);
            System.out.println("sliceArray:" + Arrays.toString(rangeArr));
            Arrays.sort(rangeArr);
            System.out.println("sortedArray:" + Arrays.toString(rangeArr));
            int inputValue = rangeArr[k - 1];

            System.out.println("inputValue:" + inputValue);
            answer[a] = inputValue;

        }
        return answer;
    }
}