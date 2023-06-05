fun main() {
    println("what is the current hour? (0-23)")
    val input = readLine()?:"0"
    var hour = input.toInt()
    if (hour > 23) hour = 23
    val timeofDay = when(hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    println("At $hour:00 $timeofDay")
}