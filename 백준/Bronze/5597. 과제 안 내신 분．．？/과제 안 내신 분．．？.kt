fun main() {
    var arrayList = arrayListOf<Int>()
    for (i in 1..30) {
        arrayList.add(i)
    }

    for (i in 1..28) {
        val input = readln().toInt()
        arrayList.remove(input)
    }
    println("${arrayList.min()}")
    println("${arrayList.max()}")

}