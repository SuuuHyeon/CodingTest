fun main() {
    val array = Array(5) { CharArray(5) { ' ' } }
    var maxSize = 0
    var result = ""

    for (i in 0 until 5) {
        val input = readln().toCharArray()
        array[i] = input
        maxSize = Math.max(maxSize, input.size) // 더 큰 거 리턴
    }

    for (i in 0 until maxSize) {
        for (j in 0 until 5) {
            if (array[j].getOrNull(i) == null) continue
            result += array[j][i]
        }
    }

    print(result)
}