package assign2_june_08

fun main() {
    val studentMarks = HashMap<String, Int>()
    studentMarks["John"] = 80
    studentMarks["Jane"] = 65
    studentMarks["Alice"] = 90
    studentMarks["Bob"] = 70

    for ((name, mark) in studentMarks) {
        if (mark > 75) {
            println(name)
        }
    }
}
