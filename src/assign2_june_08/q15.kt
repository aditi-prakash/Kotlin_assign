package assign2_june_08

fun main() {
    val nullableString: String? = null


    val lengthSafeCall = nullableString?.length
    println("Length with safe call (?.): $lengthSafeCall")

    val lengthWithDefault = nullableString?.length ?: -1
    println("Length with Elvis operator (?:): $lengthWithDefault")
}
