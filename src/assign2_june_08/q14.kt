package assign2_june_08

fun maxOrMinusOne(numbers: List<Int>?): Int {
    if (numbers == null || numbers.isEmpty()) return -1

    var max = numbers[0]
    for (num in numbers) {
        if (num > max) max = num
    }
    return max
}

fun main() {
    println(maxOrMinusOne(listOf(3, 7, 2, 9, 5)))
    println(maxOrMinusOne(null))
    println(maxOrMinusOne(emptyList()))
}
