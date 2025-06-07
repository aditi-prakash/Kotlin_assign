package assign1_june_07

fun main() {
    print("Enter caffeine level (0–100): ")
    val caffeineLevel = readln().toIntOrNull() ?: -1
    val strength = when (caffeineLevel) {
        in 0..30 -> "Mild"
        in 31..70 -> "Medium"
        in 71..100 -> "Strong"
        else -> "Unknown Strength"
    }
    println("Based on caffeine level $caffeineLevel, your coffee strength is: $strength")
}
