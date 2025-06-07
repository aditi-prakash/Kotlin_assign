package assign1_june_07

fun main() {
    var strength = 0
    while (strength < 80) {
        println("Brewing... Current strength: $strength")
        strength += 10
    }
    println("Coffee is ready! Final strength: $strength")
}
