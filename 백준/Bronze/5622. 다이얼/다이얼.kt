fun main() {
    val input = readln()

    var sum = 0
    for (i in input.indices) {
        val num = when (input[i]) {
            'A', 'B', 'C' -> 3
            'D', 'E', 'F' -> 4
            'G', 'H', 'I' -> 5
            'J', 'K', 'L' -> 6
            'M', 'N', 'O' -> 7
            'P', 'Q', 'R', 'S' -> 8
            'T', 'U', 'V' -> 9
            'W', 'X', 'Y', 'Z' -> 10
            else -> 0
        }
        sum += num
    }
    println(sum)
}