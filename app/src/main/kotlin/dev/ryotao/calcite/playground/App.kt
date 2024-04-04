package dev.ryotao.calcite.playground
import org.apache.calcite.jdbc.Driver

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    val driver = Class.forName("org.apache.calcite.jdbc.Driver")
    println(App().greeting)
}
