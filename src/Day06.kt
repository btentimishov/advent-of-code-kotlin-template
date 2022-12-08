var stack: MutableList<Char> = mutableListOf()

fun removeUntil(c: Char, list: MutableList<Char>) {
    while (list.isNotEmpty() && list.first() != c) {
        list.removeFirst()
    }
    list.removeFirst()
}


fun main() {
    val text = readInput("Day06")[0]
    println(part1(text))
    println(part2(text))
}

fun findStringWithoutDuplicates(text: String, length: Int): Int {
    for ((index, c) in text.withIndex()) {
        if (stack.size == length) return index

        if (stack.contains(c)) removeUntil(c, stack)
        stack.add(c)
    }

    return 0
}

fun part1(text: String): Int {
    return findStringWithoutDuplicates(text, 4)
}

fun part2(text: String): Int {
    return findStringWithoutDuplicates(text, 14)
}