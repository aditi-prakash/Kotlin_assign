package assign3_june_10

fun main() {
    val name: String? = "apple"

    name?.let {
        println("Uppercase name: ${it.uppercase()}")
    }
}
