////////fun main() {
////////    val input = readLine()!!
////////    for ((index, char) in input.withIndex()) {
////////        val position = (index + 0).toString().padEnd(2, '>')
////////        println("$position $char")
////////    }
////////}
//////
//////fun main () {
//////    val input = readLine()!!
//////    for (char in input) {
//////        println(char)
//////    }
//////}
////
////fun main() {
////    val input = readLine()!!
////    val n = input.toInt()
////
////    for (i in 1..n) {
////        for (j in 1..n) {
////            print(if ((i + j) % 2 == 0) "0" else "1")
////        }
////        println()
////    }
////}
////
////fun main() {
////    val input = readLine()!!
////    val n = input.toInt()
////    for (i in 1..n) {
////        for (j in 1..n) {
////            if (i == 1 || i == n || j == 1 || j == n) {
////                print("1")
////            } else {
////                print("0")
////            }
////        }
////        println()
////    }
////}
//fun main() {
//    val input = readLine()!!
//    val n = input.toInt()
//    val center = (n + 1) / 2
//    for (i in 1..n) {
//        for (j in 1..n) {
//            if (i == center || j == center) {
//                print("0")
//            } else {
//                print("1")
//            }
//        }
//        println()
//    }
//}

//import java.util.Scanner
//
//fun main() {
//    var input = Scanner(System.`in`)
//    var t = input.nextInt()
//    repeat(t) {
//        var number = input.nextInt()
//        var last = number % 10
//        var first = 0
//        while (number != 0) {
//            last = number % 10
//            number /= 10
//            last += first
//        }
//        println(last)
//    }
//}
