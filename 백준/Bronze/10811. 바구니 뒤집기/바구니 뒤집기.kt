fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val arrayList = IntArray(N) { index -> index + 1 }

    for (i in 0 until M) {
        val (num1, num2) = readln().split(" ").map { it.toInt() }
        if (num1 != num2) {
            for (j in 0 until (num2 - num1 + 1) / 2) {
                val temp = arrayList[num1 - 1 + j]
                arrayList[num1 - 1 + j] = arrayList[num2 - 1 - j]
                arrayList[num2 - 1 - j] = temp
            }
        }
    }
    arrayList.forEach { print("$it ") }
}
