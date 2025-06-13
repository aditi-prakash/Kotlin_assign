package assign_june_13

fun validateInput(input: String) {
    if (input.isBlank())
        throw IllegalArgumentException("Input cannot be blank")
}

fun main() {
    validateInput("hello")
}
