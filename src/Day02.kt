fun main() {
    val input = readInput("Day02")

    //1 point for win with rock A, X
    //2 point for win with paper B, Y
    //3 point for win with scissors C, Z


    // 6 points for win, 3 points for draw, 0 points for draw


    fun part1() {
        // part 2
        var secondScore = 0
        for (h in input) {

            val opponent = h[0]
            val me = h[2]

            when(opponent) {
                'A' -> when(me) {
                    'X' -> secondScore += 1 + 3
                    'Y' -> secondScore += 2 + 6
                    'Z' -> secondScore += 3 + 0
                }
                'B' -> when(me) {
                    'X' -> secondScore += 1 + 0
                    'Y' -> secondScore += 2 + 3
                    'Z' -> secondScore += 3 + 6
                }
                'C' -> when(me) {
                    'X' -> secondScore += 1 + 6
                    'Y' -> secondScore += 2 + 0
                    'Z' -> secondScore += 3 + 3
                }
            }
        }

        println("The score is : $secondScore")
    }



    fun part2 () {

        //X means you need to lose,
        //Y means you need to end the round in a draw
        //Z means you need to win. Good luck!"
        var myScore = 0
        // part 1
        for (h in input) {

            val opponent = h[0]
            val end = h[2]

            when(opponent) {
                'A' -> when(end) { // ROCK
                    'X' -> myScore += 3 + 0 // I need to  lose and need scissors
                    'Y' -> myScore += 1 + 3 // I need to draw and use rock
                    'Z' -> myScore += 2 + 6 // I need to  win and use paper
                }
                'B' -> when(end) { // PAPER
                    'X' -> myScore += 1 + 0 // I need to lose and need rock
                    'Y' -> myScore += 2 + 3 // I need to draw and need paper
                    'Z' -> myScore += 3 + 6
                }
                'C' -> when(end) { // SCISSORS
                    'X' -> myScore += 2 + 0
                    'Y' -> myScore += 3 + 3
                    'Z' -> myScore += 1 + 6
                }
            }
        }

        println("The score is : $myScore")
    }

    part2()







}

