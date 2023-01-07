import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {

        val x = input.nextInt()
        val y = input.nextInt()


        val r = ((y).toFloat() / x) * 100


        println(if (r >= 50) "YES" else "NO")
    }
}