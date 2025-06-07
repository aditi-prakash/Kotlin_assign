package assign1_june_07

fun main() {
    print("Enter a day number (1–7): ")
    val dayNumber = readln().toIntOrNull() ?: -1
    val recommendation = when (dayNumber) {
        1 -> "Try an espresso to start your week strong!"
        2 -> "Latte Tuesday – smooth and creamy."
        3 -> "Wednesday is perfect for a cappuccino."
        4 -> "Mocha Thursday – treat yourself!"
        5 -> "Friday calls for a flat white!"
        6 -> "Saturday? Go bold with a cold brew."
        7 -> "Relax with a decaf on Sunday."
        else -> "Hmm, that's not a day I know."
    }
    println(recommendation)
}
