package assign2_june_08

fun main() {
    val names = arrayListOf("Alice", "Bob", "Andrew", "Charlie", "Amanda")
    var i = 0
    while (i < names.size) {
        if (names[i].startsWith("A") || names[i].startsWith("a")) {
            names.removeAt(i)
        } else {
            i++
        }
    }
    println(names)
}
