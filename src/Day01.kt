import kotlin.math.max

fun main() {
    fun part1(input: List<String>): Int {
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
        println("Max score is : $max")
        return max
    }

    fun part2(input: List<String>): Int {
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

        println("Sum of three max scores is : $result")
        return result
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
