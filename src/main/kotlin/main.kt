fun hw() {
    println("Hello, world!")
}

fun sum(a: Int, b: Int) = a + b

fun hw2() {
    println("Hello, world! Hello, world!")
}

fun hw3() {
    println("Hello, world! Hello, world! Hello, world!")
}

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(a)
}