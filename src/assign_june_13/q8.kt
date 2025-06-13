package assign_june_13

fun main() {
    val sentence = "Kotlin is a modern programming language"
    val vowels = sentence.lowercase().filter { it in "aeiou" }.toSet()
    println(vowels)
}
