package assign2_june_08

fun sumOfOddNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (num in numbers) {
        if (num % 2 != 0) {
            sum += num
        }
    }
    return sum
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val result = sumOfOddNumbers(numbers)
    println("Sum of odd numbers: $result")
}


