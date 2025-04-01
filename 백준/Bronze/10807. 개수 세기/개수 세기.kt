fun main() {
    val length = readln().toInt()
    val numbers = readln().split(" ").map{ it.toInt() }
    val num = readln().toInt()
    
    var count = 0
    
    for(i in 0 until length) {
        if(numbers[i] == num) count++
    }
    
    print("$count")
    
    
}