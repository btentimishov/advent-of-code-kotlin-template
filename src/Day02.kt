fun main() {
    //1 point for win with rock A, X
    //2 point for win with paper B, Y
    //3 point for win with scissors C, Z
    // 6 points for win, 3 points for draw, 0 points for draw
    fun part1(input: List<String>): Int {
        // part 2
        var score = 0
        for (h in input) {

            val opponent = h[0]
            val me = h[2]

            when (opponent) {
                'A' -> when (me) {
                    'X' -> score += 1 + 3
                    'Y' -> score += 2 + 6
                    'Z' -> score += 3 + 0
                }

                'B' -> when (me) {
                    'X' -> score += 1 + 0
                    'Y' -> score += 2 + 3
                    'Z' -> score += 3 + 6
                }

                'C' -> when (me) {
                    'X' -> score += 1 + 6
                    'Y' -> score += 2 + 0
                    'Z' -> score += 3 + 3
                }
            }
        }

        println("Part1: The score is : $score")
        return score
    }

    fun part2(input: List<String>): Int {
        //X means you need to lose,
        //Y means you need to end the round in a draw
        //Z means you need to win. Good luck!"
        var myScore = 0
        // part 1
        for (h in input) {

            val opponent = h[0]
            val end = h[2]

            when (opponent) {
                'A' -> when (end) { // ROCK
                    'X' -> myScore += 3 + 0 // I need to  lose and need scissors
                    'Y' -> myScore += 1 + 3 // I need to draw and use rock
                    'Z' -> myScore += 2 + 6 // I need to  win and use paper
                }

                'B' -> when (end) { // PAPER
                    'X' -> myScore += 1 + 0 // I need to lose and need rock
                    'Y' -> myScore += 2 + 3 // I need to draw and need paper
                    'Z' -> myScore += 3 + 6
                }

                'C' -> when (end) { // SCISSORS
                    'X' -> myScore += 2 + 0
                    'Y' -> myScore += 3 + 3
                    'Z' -> myScore += 1 + 6
                }
            }
        }

        println("Part2: The score is : $myScore")
        return myScore
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}

