package assign2_june_08

fun main() {
    val numbers = ArrayList<Int>()
    for (i in 1..10) {
        numbers.add(i)
    }
    for (num in numbers) {
        if (num % 2 == 0) {
            println(num)
        }
    }
}
