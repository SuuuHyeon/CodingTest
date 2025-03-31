fun main() {
    val input = readln().toInt()
    
    for(i in 1..input) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}