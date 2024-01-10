package ClassesAndObjects

//The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor, and some other things),
class ConstructorExample() {


}
//Class with Primary constructor
class Person(val name: String, val age: Int, val occupasion: String){
    //Secondary Constructor
    //A class in Kotlin has a primary constructor and possibly one or more secondary constructors.
    constructor(nameParam: String, occupasionParam: String) : this(nameParam, 4, occupasionParam) {

    }


}



fun main(){
    val person: Person = Person("Jemy", "Developer")
    println("Name: ${person.name}, Age: ${person.age}, Occupation: ${person.occupasion}")

}

