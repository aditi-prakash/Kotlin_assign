package assign1_june_07

fun main() {
    for (i in 1..10) {
        if (i == 5) {
            println("Rush hour! Too many orders!")
            break
        }
        println("Processing coffee order #$i")
    }
}
