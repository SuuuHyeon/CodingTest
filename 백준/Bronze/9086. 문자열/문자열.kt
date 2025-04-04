fun main() {
    val num = readln().toInt()

    repeat(num) {
        val input = readln()
        println("${input.first()}${input.last()}")
    }
}
