import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val a = input.nextInt()
        val b = input.nextInt()
        val c = a*b
        val d = c/4
        if(c%4!=0)
            println(d+1)
        else
            println(d)
}
}