package ClassesAndObjects

class InheritanceExample {

}

open class BaseClass {
    open val a = 3
    open fun run() : String{
      return "Inside Base run"
    }
}

class Derived : BaseClass() {
    override var a = 4
    override fun run() : String {
        super.run()
        return "Inside Derived run"
    }
}

interface Shape {
    val vertexCount: Int
}

open class Circle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
}

fun main(){
    val derived = Derived()
    println(derived.run())
    val circle : Circle = Circle()
    println(circle.vertexCount)
}
