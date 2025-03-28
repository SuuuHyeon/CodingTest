class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        
        val multiple: Int = 2 * a * b
        val temp: Int = (a.toString() + b.toString()).toInt()
        
        if(multiple > temp.toInt()) answer = multiple else answer = temp
        
        return answer
    }
}