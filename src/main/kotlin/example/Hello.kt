package example

fun main(args: Array<String>) {
    "Kotlin".hello()
}

fun String.hello() {
    println("Hello, $this!")
}
