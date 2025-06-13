package assign_june_13

fun main() {
    val items = setOf("apple", "banana", "cherry")
    val searchItem = "banana"
    if (searchItem in items) {
        println("$searchItem exists in the set")
    } else {
        println("$searchItem does not exist in the set")
    }
}
