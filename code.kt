fun main() {
    //first task
    println(123 + 456 * 789)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)

    // second task
    val score1 = 79
    val score2 = 92
    val score3 = 86

    val total = score1 + score2 + score3
    val average = total / 3

    println(total)
    println(average)

    // third task
    val averageDouble = total / 3.0
    println(averageDouble)
    println("Total score = $total")
    println("Average score = %.2f".format(averageDouble))

    // fourth task
    val boostMultiplier = 4
    val scoreBoost = total * boostMultiplier
    val finalBoostedScore = total + scoreBoost

    println("Score boost = $scoreBoost")
    println("Final boosted score = $finalBoostedScore")
}