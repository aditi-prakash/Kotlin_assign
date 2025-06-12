package assign3_june_10

class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)
}

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob")

    println("Name: ${person1.name}, Age: ${person1.age}")
    println("Name: ${person2.name}, Age: ${person2.age}")
}
