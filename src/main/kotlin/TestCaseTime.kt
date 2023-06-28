import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val a = input.nextInt()
        val b = input.nextInt()
        val c = a*b
        println(c/100)
}
}