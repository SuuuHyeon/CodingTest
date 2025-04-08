fun main() {
    val input = readln().uppercase()
    val map = mutableMapOf<Char, Int>()

    for (i in input.indices) {
        if (!map.containsKey(input[i])) {
            map[input[i]] = 1
        } else {
            map[input[i]] = map[input[i]]!! + 1
        }
    }
    val max = map.maxBy { it.value }

    if (map.filter { it.value == max.value }.count() > 1) print("?") else print(max.key)
}