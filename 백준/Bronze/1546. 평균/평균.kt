fun main() {
    val total = readln().toInt()
    val score = readln().split(" ").map { it.toDouble() }.toMutableList()

    val max = score.max()

    for(i in score.indices) {
        val newScore = score[i] / max * 100
//        if(newScore)

        score[i] = newScore
    }
    print("${score.average()}")

}
