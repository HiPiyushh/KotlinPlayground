import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val x = input.nextInt()

        if (15>=x) {println("Yes")}
        else {println("No")}
    }
}