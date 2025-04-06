fun main() {
    val number = readln().toInt()

    repeat(number) {
        val (num, word) = readln().split(" ")
        val rep = num.toInt() // 반복 수

        val result = word.map { it.toString().repeat(rep) }
        println(result.joinToString(""))
    }
}
