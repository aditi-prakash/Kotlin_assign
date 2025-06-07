package assign1_june_07

fun main() {
    print("Enter coffee temperature in Celsius: ")
    val temp = readln().toIntOrNull() ?: -1
    val category = when (temp) {
        in 0..50 -> "Too Cold"
        in 51..70 -> "Perfect"
        in 71..100 -> "Too Hot"
        else -> "Invalid Temperature"
    }
    println("Coffee is: $category")
}
