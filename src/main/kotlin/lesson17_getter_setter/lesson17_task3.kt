package lesson17_getter_setter

fun main() {
    val newFolder0 = Folder("Папка0", 20, true)
    val newFolder1 = Folder("Папка1", 10, false)

    println(newFolder0.name)
    println(newFolder1.name)
}

class Folder(
    _name: String,
    private val filesQuantity: Int,
    private val isSecret: Boolean,
) {
    val name: String = _name
        get() {
            return when (isSecret) {
                true -> "Скрытая папка\nКол-во файлов - 0\n"
                else -> "Имя папки - $field\nКол-во файлов - $filesQuantity\n"
            }
        }
}

