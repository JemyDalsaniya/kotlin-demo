package ClassesAndObjects

class CompanionObjectExample {

    //Class members can access the private members of the corresponding companion object.
    var hello = test
    //it is like static in java
    companion object {
        fun create(): CompanionObjectExample = CompanionObjectExample()
        fun hello(): String = "Hello There!"
        private var test = "Gems"
    }
}

fun main(){
    val instance = CompanionObjectExample.create()
    val value = CompanionObjectExample.hello()
    //if name is not given to companion object
    val x = CompanionObjectExample()
    println("value = $value")
    println("value = ${x.hello}")
}
