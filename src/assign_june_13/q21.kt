package assign_june_13

fun main() {
    val input = "abc"
    try {
        val number = input.toInt()
        println(number)
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }
}
