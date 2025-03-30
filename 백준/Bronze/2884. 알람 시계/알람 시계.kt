fun main() {
    val input = readln().split(" ").map { it.toInt() }
    var hours = input[0]
    var minuites = input[1]
    
    if(minuites < 45) {
        if(hours == 0) {
            hours = 23
        } else {
            hours--
        }
        minuites -= 45
        if(minuites < 0) {
            minuites += 60
        }
    } else {
        minuites -= 45
    }
    println("$hours $minuites")
    
}