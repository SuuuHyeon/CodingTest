fun main() {
    val strList = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var inputStr = readln()
    var count = inputStr.length

    for (i in strList) {
        while (true) {
            if (inputStr.contains(i)) {
                // 인덱스 찾기
                val index = inputStr.indexOf(i)

                if (i != "dz=") {
                    val removedStr = inputStr.replaceRange(index..index + 1, " ")
                    inputStr = removedStr
                    count--
                } else {
                    val removedStr = inputStr.replaceRange(index..index + 2, " ")
                    inputStr = removedStr
                    count -= 2
                }
            } else break
        }
    }
    print(count)
}