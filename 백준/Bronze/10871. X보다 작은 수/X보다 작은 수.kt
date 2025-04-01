fun main() {
    val (length, num) = readln().split(" ").map { it.toInt() }
    val input = readln().split(" ").map { it.toInt() }
    
    var array = arrayListOf<Int>()
    
    for(i in 0 until length) {
        if(input[i] < num) array.add(input[i])
    }
    for(i in 0 until array.size) {
        print("${array.get(i)} ")
    }
    
}