import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0

        // 모든 수의 곱
        val multiple: Int = num_list.reduce{ a, b -> a * b }
        // 모든 수 합의 제곱
        val addPow: Double = num_list.sum().toDouble().pow(2)
        
        if(multiple < addPow) answer = 1 else answer = 0
        
        return answer
    }
}
