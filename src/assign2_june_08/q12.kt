package assign2_june_08

fun main() {
    val nullableInt: Int? = 42

    val result = nullableInt?.let { "The value is $it" } ?: "Value is missing"

    println(result)
}
