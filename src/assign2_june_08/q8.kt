package assign2_june_08

fun fullName(first: String = "", last: String = ""): String {
    return "$first $last".trim()
}

fun main() {
    val name1 = fullName("John", "Doe")
    val name2 = fullName("Alice")
    val name3 = fullName(last = "Smith")
    val name4 = fullName()

    println(name1)
    println(name2)
    println(name3)
    println(name4)
}
