package lesson19_enum_companion

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.loadBlueBulletType()
    tank.shoot()
    tank.loadGreenBulletType()
    tank.shoot()
    tank.loadRedBulletType()

    repeat(Ammo.entries.size) {
        tank.shoot()
        tank.loadNextBulletsType()
    }
}

enum class Ammo(val type: String, val damage: Int) {
    BLUE("голубой", 5),
    GREEN("зелёный", 10),
    RED("красный", 20),
}

class Tank() {
    private var bulletType: Ammo? = null
    fun printAmmoInfo() = println("Заряжен ${bulletType?.type ?: "null"} тип снаряда")

    fun loadBlueBulletType() {
        bulletType = Ammo.BLUE
        printAmmoInfo()
    }

    fun loadGreenBulletType() {
        bulletType = Ammo.GREEN
        printAmmoInfo()
    }

    fun loadRedBulletType() {
        bulletType = Ammo.RED
        printAmmoInfo()
    }

    fun loadNextBulletsType() {
        bulletType = when (bulletType) {
            Ammo.BLUE -> Ammo.GREEN
            Ammo.GREEN -> Ammo.RED
            Ammo.RED -> Ammo.BLUE
            else -> Ammo.BLUE
        }
        printAmmoInfo()
    }

    fun shoot() {
        if (bulletType == null) println("Танк ничем не заряжен\n")
        else println("Выстрел. Нанесено - ${bulletType?.damage} ед. урона\n")
    }
}