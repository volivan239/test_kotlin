fun hw() {
    println("Hello, world!")
}

fun hw2() {
    println("Hello, world! Hello, world!")
}

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(a)
}