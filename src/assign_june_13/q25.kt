package assign_june_13

fun main() {
    try {
        val list: List<String>? = null
        println(list!!.get(1))
    } catch (e: NullPointerException) {
        println("Null value encountered")
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of range")
    }
}
