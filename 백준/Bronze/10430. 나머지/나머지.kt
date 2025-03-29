//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C
//셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val A = input.nextInt()
    val B = input.nextInt()
    val C = input.nextInt()
    
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)    
}