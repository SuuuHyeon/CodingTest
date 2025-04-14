fun main() {
    val arrStr = StringBuilder()

    // 각 행렬의 크기
    val (N, M) = readln().split(" ").map { it.toInt() }

    val arr1 = Array(N) { IntArray(M) }
    val arr2 = Array(N) { IntArray(M) }

    for (i in 0 until N) {
        val input = readln().split(" ").map { it.toInt() }
        for (j in 0 until M) {
            arr1[i][j] = input[j]
        }
    }

    for (i in 0 until N) {
        val input = readln().split(" ").map { it.toInt() }
        for (j in 0 until M) {
            arr2[i][j] = input[j]
        }
    }

    for (i in 0 until N) {
        for (j in 0 until M) {
            arrStr.append("${arr1[i][j] + arr2[i][j]} ")
        }
        arrStr.append("\n")
    }

    print(arrStr)
}