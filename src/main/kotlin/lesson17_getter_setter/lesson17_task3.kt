package lesson17_getter_setter

fun main() {
    val newFolder0 = Folder("Папка0", 20, true)
    val newFolder1 = Folder("Папка1", 10, false)

    println("${newFolder0.name}, ${newFolder0.filesQuantity}")
    println("${newFolder1.name}, ${newFolder1.filesQuantity}")
}

class Folder(
    name: String,
    filesQuantity: Int,
    private val isSecret: Boolean,
) {
    val name: String = name
        get() = if (isSecret) "Скрытая папка" else field
    val filesQuantity: Int = filesQuantity
        get() = if (isSecret) 0 else field

}

