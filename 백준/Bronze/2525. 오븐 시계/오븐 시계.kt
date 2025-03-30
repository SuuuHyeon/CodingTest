fun main() {
    val input = readln().split(" ").map {it.toInt()}
    var h = input[0] // 원래 시간
    var m = input[1] // 원래 분
    
    val add = readln().toInt()
    
    val addH = add / 60 // 추가 시간
    val addM = add % 60 // 추가 분
    
    h += addH
    m += addM
    if(m >= 60) {
        h++
        m -= 60
    }
    if(h > 23) {
        h = h % 24
    }
    println("$h $m")
    
}