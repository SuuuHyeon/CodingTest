// Case #1: 1 + 1 = 2
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val input = br.readLine().toInt()
    for(i in 1..input) {
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("Case #${i}: $a + $b = ${a+b}" + "\n")
    }
    bw.flush()
    bw.close()
}