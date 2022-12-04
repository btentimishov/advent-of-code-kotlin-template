fun main() {
    fun part1(input: List<String>): Int {
        var result = 0

        for (line in input) {
            var i = 0

            var temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }
            val aStart = temp.toInt()

            i++
            temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }

            val aEnd = temp.toInt()

            i++
            temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }

            val bStart = temp.toInt()

            i++
            temp = ""
            while(i < line.length) {

                if (line[i].isDigit()) temp += line[i]
                i++
            }
            val bEnd = temp.toInt()

            if((aStart <= bStart && bEnd <= aEnd)
                    || (bStart <= aStart && aEnd <= bEnd)) result++

        }

        return result
    }

    fun part2(input: List<String>): Int {
        var result = 0

        for (line in input) {
            var i = 0

            var temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }
            val aStart = temp.toInt()

            i++
            temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }

            val aEnd = temp.toInt()

            i++
            temp = ""
            while(line[i].isDigit()) {
                temp += line[i]
                i++
            }

            val bStart = temp.toInt()

            i++
            temp = ""
            while(i < line.length) {

                if (line[i].isDigit()) temp += line[i]
                i++
            }
            val bEnd = temp.toInt()
            println("[$aStart, $aEnd] - [$bStart, $bEnd]")


            if ((bStart in aStart..aEnd) or (bEnd in aStart .. aEnd)
                    or (aStart in bStart .. bEnd) or (aEnd in bStart .. bEnd)) {
                result++
            }
        }

        return result
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}