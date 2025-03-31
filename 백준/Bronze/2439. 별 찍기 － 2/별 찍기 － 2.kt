fun main() {
    val input = readln().toInt()
    
    for(i in 1..input) {
        for(j in 1..(input-i)) {
            print(" ")
        }
        for(k in 1..i) {
            print("*")
        }
        println()
    }
}