fun main() {
    // 원래 체스 피스의 개수를 넣은 배열
    val chessArray = arrayOf(1,1,2,2,2,8)
    // 결과값 넣을 arrayList
    val list = arrayListOf<Int>()

    // input을 공백 기준으로 분할하여 list반환
    val input = readln().split(" ").map { it.toInt() }

    for(i in input.indices) {
        list.add(chessArray[i] - input[i])
    }
    print(list.joinToString(" "))
}
