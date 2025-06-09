package assign2_june_08

fun main() {
    val nullableString: String? = "Hello World"

    nullableString
        ?.takeIf { it.isNotBlank() }
        ?.reversed()
        ?.let { println(it) }
}
