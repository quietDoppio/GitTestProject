package lesson21_extension

import java.io.File

fun main() {
    val file = File("newFile.txt")
    file.writeNewFile("мир!")
    file.writeNewFile("Привет,")
    println(file.readText())
}

fun File.writeNewFile(word: String) {
    writeText("${word.lowercase()} ${readText()}")
}


