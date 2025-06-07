package assign1_june_07

fun main() {
    print("Enter your age: ")
    val age = readln().toIntOrNull() ?: 0
    if (age >= 60) {
        println("You're eligible for a senior discount! Enjoy your coffee.")
    } else {
        println("No senior discount yet – but coffee loves everyone!")
    }
}
