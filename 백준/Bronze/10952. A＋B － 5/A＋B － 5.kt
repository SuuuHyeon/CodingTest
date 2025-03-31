fun main() {
    val i: Boolean = true
    
    while(i) {
        val input = readln().split(" ").map{ it.toInt() }
        if(input[0] == 0 && input[1] == 0) return
        println((input[0] + input[1]).toString())
    }
}