package lesson15_interface

fun main(){
    val duck = Duck()
        duck.swim()
        duck.fly()
    val gull = Gull()
        gull.fly()
    val crucianCarp = CrucianCarp()
        crucianCarp.swim()


}
interface Swimmable{
    fun swim()
}
interface Flyable{
    fun fly()
}

class Duck(): Swimmable, Flyable {
    override fun swim() {
        println("Утка плывёт")
    }
    override fun fly() {
        println("Утка летит")
    }
}
class Gull(): Flyable{
    override fun fly() {
        println("Чайка летит")
    }

}
class CrucianCarp(): Swimmable {
    override fun swim() {
        println("Карась плывёт")
    }
}