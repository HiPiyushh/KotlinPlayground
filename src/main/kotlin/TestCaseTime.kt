import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val w = input.nextInt()
        val x = input.nextInt()
        val y = input.nextInt()
        val z = input.nextInt()

     println("${w+ ((x-y)* z)}")
}
}