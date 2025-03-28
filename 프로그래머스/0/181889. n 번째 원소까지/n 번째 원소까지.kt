class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 1..n) {
            answer += num_list[i-1]
        }
        return answer
    }
}