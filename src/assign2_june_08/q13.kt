package assign2_june_08

fun main() {
    val nullableNumberString: String? = "123"

    val result = nullableNumberString
        ?.toIntOrNull()
        ?.times(2)

    if (result != null) {
        println(result)
    } else {
        println("Invalid number or null input")
    }
}
