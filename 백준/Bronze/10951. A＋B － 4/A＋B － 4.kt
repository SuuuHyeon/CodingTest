fun main() {
    while(true) {
        val input = readLine()
        if(input == null) return
        
        val (a,b) = input.split(" ").map{it.toInt()}
        println(a+b)
    }
}