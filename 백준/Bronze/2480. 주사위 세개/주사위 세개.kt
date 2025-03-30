// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

fun main() {
    // 3개의 수 받기
    val input = readln().split(" ").map { it.toInt() }
    val list = input.sorted() // sorted()는 원시 배열은 그대로 두고 복제하여 정렬
    
    val num1 = list[0]
    val num2 = list[1]
    val num3 = list[2]
   
    val price = when {
        num1 == num2 && num1 == num3 -> 10000 + num1*1000
        num1 == num2 || num2 == num3 -> 1000 + num2 * 100
        else -> num3 * 100
    }
    println(price)
}