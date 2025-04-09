fun main() {
    val rep = readln().toInt() // 단어 수
    var count = 0


    for (i in 1..rep) {
        val array = arrayListOf<Char>()
        val word = readln()
        array.add(word[0])
        if (word.length == 1) {
            count++
        } else {
            for (j in 1 until word.length) {
                if (word[j] != word[j - 1]) array.add(word[j])
            }
            if(word.toSet().size == array.size) count++
        }
    }
    println(count)
}