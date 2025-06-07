package assign1_june_07

import kotlin.random.Random

fun main() {
    val tip = when (Random.nextInt(1, 5)) {
        1 -> "Tip: Stir before you sip!"
        2 -> "Tip: Don't microwave your espresso!"
        3 -> "Tip: Try oat milk today!"
        4 -> "Tip: Support your local barista!"
        else -> "Tip: Enjoy your brew!"
    }
    println(tip)
}
