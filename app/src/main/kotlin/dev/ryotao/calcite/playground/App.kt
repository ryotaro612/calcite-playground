package dev.ryotao.calcite.playground
import org.apache.calcite.jdbc.Driver
import java.sql.DriverManager

class App {
    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
//    val driver = Class.forName("org.apache.calcite.jdbc.Driver")
    val driver = Class.forName("org.apache.calcite.avatica.remote.Driver")

    val connection = DriverManager.getConnection("jdbc:avatica:remote:url=http://127.0.0.1:8765;serialization=protobuf")
    val statement = connection.createStatement();
    /*SQL文を作成する*/

    val result = statement.executeQuery("show databases;");
    while (result.next()) {
        println(result.getString(1))
    }

    result.close()
    statement.close()
    connection.close()

    println(App().greeting)
}
