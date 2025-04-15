fun main() {
    val array = Array(9) { IntArray(9) }
    var max = 0
    var rowValue = 0
    var colValue = 0

    for (i in 0 until 9) {
        val input = readln().split(' ').map { it.toInt() }
        for (j in 0 until 9) {
            array[i][j] = input[j]
        }
    }


    for ((i, row) in array.withIndex()) {
        for ((j, col) in row.withIndex()) {
            if (col >= max) {
                max = col
                rowValue = i + 1
                colValue = j + 1
            }
        }
    }

    println(max)
    print("$rowValue $colValue")
}
