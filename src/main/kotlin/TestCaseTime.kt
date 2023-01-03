import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {
        val n = input.nextInt()
        val x = input.nextInt()


        println(if(n <= 6) x else if(n%6 == 0) (n/6)*x else ((n/6)+1)*x)
}
}