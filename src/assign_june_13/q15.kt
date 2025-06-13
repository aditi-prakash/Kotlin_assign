package assign_june_13

fun main() {
    val isPalindrome: (String) -> Boolean = { it == it.reversed() }
    println(isPalindrome("madam"))
    println(isPalindrome("hello"))
}
