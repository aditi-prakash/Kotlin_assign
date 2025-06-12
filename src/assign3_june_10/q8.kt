package assign3_june_10

class Person1(val name: String, val age: Int)

fun main() {
    val person = Person1("Alice", 30)
    println("Name: ${person.name}, Age: ${person.age}")
}
