import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()

    repeat(t) {
        val a = input.nextInt()
        val b = input.nextInt()
        if(a*15>=b * 2) println("Yes") else println("No")
    }
}
