package aph.hello

fun main() {
    println(greeting())
}

fun greeting(name: String = "world") = "Hello, $name!"
