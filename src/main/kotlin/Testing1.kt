import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
    val a = input.nextInt()
    val b = input.nextInt()
    val x = input.nextInt()
    val y = input.nextInt()

        if (x*y>=a*b) {
            println("Yes")
        }
        else{
            println("No")
        }

    }
}