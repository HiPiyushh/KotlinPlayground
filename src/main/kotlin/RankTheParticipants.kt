fun main () {
    print ("Enter Your Rank:")
    val rank = readln().toInt();

    val rankLabel: String
    when (rank) {
        1 -> rankLabel = "winners"
        2 -> rankLabel = "First runner up"
        3 -> rankLabel = "Third runner up"
        else  -> rankLabel = "Participants"
    }

    println("Your rank is $rankLabel")
}