import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val t = input.nextInt()
    repeat(t) {

        val a = input.nextInt()
        val b = input.nextInt()
        val c = input.nextInt()


        if(((a+b)/2<35) || ((c+b)/2<35) || ((a+c)/2<35))
            println("Fail")
        else
            println("Pass")
    }
}