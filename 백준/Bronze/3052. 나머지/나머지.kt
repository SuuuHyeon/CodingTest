fun main() {
    val set = mutableSetOf<Int>()
    for(i in 1..10) {
        val input = readln().toInt()
        val num = input % 42
        set.add(num)
    }
    print("${set.size}")
}