package assign3_june_10

fun main() {
    val anyValue: Any = 25
    val age: Int? = anyValue as? Int

    println("Age: $age")
}
