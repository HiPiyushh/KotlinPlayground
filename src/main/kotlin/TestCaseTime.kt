import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val c = input.nextInt()
        val x = input.nextInt()
        val y = input.nextInt()

         println((c-x)*y)
}
}