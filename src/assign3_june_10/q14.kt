package assign3_june_10

object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

fun main() {
    Logger.log("This is a log message.")
}
