class Solution {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        for(i in 0..arr.size - 1) {
            answer += arr[i]
        }
        return answer
    }
}