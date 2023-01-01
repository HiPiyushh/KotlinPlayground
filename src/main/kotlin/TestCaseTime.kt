import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val x = input.nextInt()
        val y = input.nextInt()
        val z = input.nextInt()

        if (y <= 10*x) println(y*z)
        else println(10*x*z)
}
}