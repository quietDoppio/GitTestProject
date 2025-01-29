package lesson17_getter_setter

fun main() {
    val newParcel = Parcel(137, "Рязань")
    println(newParcel.movementCounter)
    println(newParcel.location)

    newParcel.location = "Москва"
    println(newParcel.movementCounter)
    println(newParcel.location)
}

class Parcel(
    val numberOfParcel: Int,
    private var _location: String,
) {
    private var _movementCounter: Int = 0
    val movementCounter get() = _movementCounter

    var location
        get() = _location
        set(value) {
            _location = value
            _movementCounter++
        }
}