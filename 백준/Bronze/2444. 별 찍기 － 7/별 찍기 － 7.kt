fun main() {
    val N = readln().toInt()

    for (i in 1..N) {
        println(" ".repeat(N - i) + "*".repeat(2 * i - 1))
    }
    for (i in N - 1 downTo 1) {
        println(" ".repeat(N - i) + "*".repeat(2 * i - 1))
    }

}
