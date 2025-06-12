package assign3_june_10

fun main() {
    val token: String? = "abc123"

    token?.run {
        println("Token is: $this")
        println("Token length: ${this.length}")
    }
}
