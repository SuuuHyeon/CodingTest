fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {
        val str = br.readLine()
        if (str.isNullOrEmpty()) break
        bw.write(str + "\n")
    }
    bw.flush()
    bw.close()
}