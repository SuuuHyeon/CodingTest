fun main() {
    val input = readln()
    var num = 0

    for (i in 0..<input.length / 2) {
        if (input[i] != input[input.length - i - 1]) {
            print(0)
            return
        }
    }
    print(1)
}
