import java.util.Scanner
fun main() {
    val input  = Scanner(System.`in`)
    val t = input.nextInt()

    repeat(t) {
        val n = input.nextInt()
        val m = input.nextInt()
        val k = input.nextInt()

        if (m-k >= n) {println("Yes") } else {
            println("No") }
        }

    }
