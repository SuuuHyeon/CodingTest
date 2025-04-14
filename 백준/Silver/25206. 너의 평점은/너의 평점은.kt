fun main() {

    var sum = 0.0
    var totalGrade = 0.0
    for (i in 0..19) {
        val input = readln().split(" ")
        val subject = input[0] // 과목명
        val grade = input[1].toDouble() // 학점
        val score = input[2] // 받은 점수

        val castedScore = when (score) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            else -> 0.0
        }
        if (score != "P") {
            sum += grade * castedScore
            totalGrade += grade
        }
    }
    print(sum / totalGrade)

}