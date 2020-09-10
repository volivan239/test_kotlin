fun hw() {
    println("Hello, world!")
}

fun sum(a: Int, b: Int) = a + b

fun main() {
    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(a)
}