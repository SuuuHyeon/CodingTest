fun main() {
    val input = readln().toInt()
    
    var sum: Int = 0
    for(i in 1..input) {
        sum += i
    }
    print(sum)
}