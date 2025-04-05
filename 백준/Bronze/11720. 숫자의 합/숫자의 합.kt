fun main() {
    with(readln().toInt()) {
        val numbers = readln().chunked(1).map { it.toInt() }
        println(numbers.reduce { a, b -> a + b })
    }
}