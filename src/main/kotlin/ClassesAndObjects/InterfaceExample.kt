package ClassesAndObjects

interface InterfaceExample {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun run()
    fun draw(){

    }
}

class Activity: InterfaceExample{
    override val prop: Int = 5
    override fun run() {
    }

}
