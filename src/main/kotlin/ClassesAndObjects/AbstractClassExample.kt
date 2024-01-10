package ClassesAndObjects

abstract class AbstractClassExample {
    abstract fun draw()
}

class Rectangle : AbstractClassExample(){
    override fun draw(){
        println("Override!!")
    }
}

//fun main(){
//    val rectangle : Rectangle = Rectangle()
//    rectangle.draw()
//}
