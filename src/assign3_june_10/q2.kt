package assign3_june_10

fun getLength(input: String?): Int {
    return input?.length ?: 0
}

fun main() {
    val text1: String? = "Hello, Kotlin"
    val text2: String? = null

    println("Length of text1: ${getLength(text1)}")
    println("Length of text2: ${getLength(text2)}")
}
