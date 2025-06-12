package assign3_june_10

data class User(val name: String, val email: String)

fun main() {
    val user1 = User("Alice", "alice@example.com")
    val user2 = User("Alice", "alice@example.com")
    val user3 = User("Bob", "bob@example.com")

    println(user1 == user2)
    println(user1 == user3)
}
