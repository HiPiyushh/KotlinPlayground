import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val x = input.nextInt()
        val y = input.nextInt()


        println((x*10)+(y*5))
}
}