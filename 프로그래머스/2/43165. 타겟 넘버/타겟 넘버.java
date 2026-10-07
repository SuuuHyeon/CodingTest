class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int index, int sum) {
        // 숫자 다 씀
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 더하기
        dfs(numbers, target, index + 1, sum + numbers[index]);

        // 빼기
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}