package assign_june_13

fun main() {
    val employees = mapOf("Alice" to "HR", "Bob" to "IT", "Carol" to "Finance")
    for ((name, dept) in employees) {
        println("$name -> $dept")
    }
}
