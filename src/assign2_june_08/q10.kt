package assign2_june_08

fun longestString(strings: List<String>): String {
    var longest = ""
    for (str in strings) {
        if (str.length > longest.length) {
            longest = str
        }
    }
    return longest
}

fun main() {
    val words = listOf("cat", "elephant", "dog", "hippopotamus", "fox")
    val longest = longestString(words)
    println("Longest string: $longest")
}
