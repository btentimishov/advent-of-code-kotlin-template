import java.util.Stack

private val input = readInput("Day05")
private val stacks: List<MutableList<Char>> = createStacks(input)
private val instructions: List<Instruction> = parseInstructions(input)

fun solvePart1(): String {
    performInstructions(true)
    return stacks.tops()
}

fun solvePart2(): String {
    performInstructions(false)
    return stacks.tops()
}

private fun performInstructions(reverse: Boolean) {
    instructions.forEach { (amount, source, destination) ->
        val toBeMoved = stacks[source].take(amount)
        repeat(amount) { stacks[source].removeFirst() }
        stacks[destination].addAll(0, if (reverse) toBeMoved.reversed() else toBeMoved)
    }
}

private fun Iterable<Iterable<Char>>.tops(): String =
    map { it.first() }.joinToString("")

private fun createStacks(input: List<String>): List<MutableList<Char>> {
    val stackRows = input.takeWhile { it.contains('[') }
    return (1..stackRows.last().length step 4).map { index ->
        stackRows
            .mapNotNull { it.getOrNull(index) }
            .filter { it.isUpperCase() }
            .toMutableList()
    }
}

private fun parseInstructions(input: List<String>): List<Instruction> =
    input
        .dropWhile { !it.startsWith("move") }
        .map { row ->
            row.split(" ").let { parts ->
                Instruction(parts[1].toInt(), parts[3].toInt() - 1, parts[5].toInt() - 1)
            }
        }

private data class Instruction(val amount: Int, val source: Int, val target: Int)
fun main() {



    fun part1(input: List<String>): Int {
        return 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }

//    println(solvePart1())
    println(solvePart2())
}