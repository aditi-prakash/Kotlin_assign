package assign_june_13

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    println(operateOnNumbers(4, 2) { x, y -> x + y })
    println(operateOnNumbers(4, 2) { x, y -> x * y })
    println(operateOnNumbers(4, 2) { x, y -> x - y })
}
