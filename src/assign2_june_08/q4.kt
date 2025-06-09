package assign2_june_08

fun main() {
    val words = listOf("apple", "dog", "elephant", "cat", "banana")
    var count = 0
    for (word in words) {
        if (word.length > 4) {
            count++
        }
    }
    println(count)
}
