class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd: String = ""
        var even: String = ""
        for(i in 0..num_list.size - 1) {
            if(num_list[i] % 2 == 0) even += num_list[i].toString() else odd += num_list[i].toString()
        }
        answer = odd.toInt() + even.toInt()
        return answer
    }
}
