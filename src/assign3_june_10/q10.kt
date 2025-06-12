package assign3_june_10

open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Bark")
    }
}

fun main() {
    val animal = Animal()
    val dog = Dog()

    animal.makeSound()
    dog.makeSound()
}
