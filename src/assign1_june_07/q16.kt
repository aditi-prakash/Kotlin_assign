package assign1_june_07

fun main() {
    print("Enter your coffee order name: ")
    val orderName = readln()
    if (orderName.length >= 5) {
        println("That's a solid order name!")
    } else {
        println("Short and sweet name!")
    }
}
