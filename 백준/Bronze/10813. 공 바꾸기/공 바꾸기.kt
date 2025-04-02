fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    
    val array = IntArray(N) { index -> index + 1 }
    
    for(i in 0 until M) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val temp = array[a-1]
        array[a-1] = array[b-1]
        array[b-1] = temp
    }
    print(array.joinToString(" "))
}