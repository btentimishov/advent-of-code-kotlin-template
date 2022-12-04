fun main() {
    fun part1(input: List<String>): Int {

        val list = mutableListOf<Char>()
        for (word in input) {

            val half = word.length / 2
            val set = mutableSetOf<Char>()

            for (i in word.indices) {
                if (i >= half) {
                    if (set.contains(word[i])) {
                        list.add(word[i])
                        break
                    }
                } else {
                    set.add(word[i])
                }
            }
        }


        var result = 0
        for (c in list) {
            val toAdd = (if (c.isLowerCase()) {
                c - 'a' + 1
            } else c - 'A' + 27)
            result += toAdd
        }
        return result
    }

    fun part2(input: List<String>): Int {

        val list = mutableListOf<Char>()
        var copy = mutableMapOf<Char, Int>()

        for (i in input.indices) {
            val tempMap = mutableMapOf<Char, Int>()
            for (c in input[i]) {
                if (tempMap.contains(c)) continue
                tempMap[c] = 1
            }

            for ((key, value) in tempMap) {
                if (copy.contains(key)) {
                    copy[key] = copy[key]!! + value
                } else {
                    copy[key] = value
                }
            }

            if (i > 0 && i % 3 == 2) {
                for ((key, value) in copy) {
                    println("Key: $key + value: $value")
                    if (value == 3) {
                        list.add(key)
                        break
                    }
                }
                copy = mutableMapOf()
            }



        }

        var result = 0

        for (c in list) {

            println(c)
            result += if (c.isLowerCase()) {
                c - 'a' + 1
            } else {
                c - 'A' + 27
            }
        }
        return result
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}