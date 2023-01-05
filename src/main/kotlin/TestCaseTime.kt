import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {

        val a = input.nextInt()
        val b = input.nextInt()
        val c = input.nextInt()
        val d = input.nextInt()

        (if(a+b+c+d == 0)
            println("IN")
        else
            println("OUT"))
    }
}