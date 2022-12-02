import kotlin.math.max

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")


    //to find the max

    fun findMax() {
        var max = 0
        var sum = 0
        for (num in input) {
            if (num.isEmpty()) {
                max = max(max, sum)
                sum = 0
            } else {
                sum += num.toInt()
            }
        }
        println(max)
    }

    fun findSumOfThreeMax() {
        var sum = 0
        val arr: MutableList<Int> = mutableListOf()
        for (num in input) {
            if (num.isEmpty()) {
                arr += sum
                sum = 0
            } else {
                sum += num.toInt()
            }
        }

        arr.sort()

        var result = 0
        var i = arr.size - 1
        for (n in 1..3) {
            result += arr[i]
            i--
        }

        println(result)
    }

    findSumOfThreeMax()


//    println(part1(input))
//    println(part2(input))
}
