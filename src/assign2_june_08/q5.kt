package assign2_june_08

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    val squares = ArrayList<Int>()
    for (num in nums) {
        squares.add(num * num)
    }
    println(squares)
}
