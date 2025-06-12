package assign3_june_10

class MathUtils {
    companion object {
        fun square(n: Int): Int {
            return n * n
        }
    }
}

fun main() {
    println(MathUtils.square(5))
}
