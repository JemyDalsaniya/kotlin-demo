
    fun dataTypes(){
        var numberType = 1
        var booleanType = true
        var stringType = "Hello There"
        var charType = "a"

        val initArray = Array<Int>(3) { 0 }
        var array = arrayOf(1,2,3,4,5)
        val nullArray: Array<Int?> = arrayOfNulls(3)
        val asc = Array(5) { i -> (i * i).toString() }

        val lettersArray = arrayOf("c", "d")
        printAllStrings("a", "b", *lettersArray)


        println(nullArray.joinToString())
        println(array.joinToString())
        asc.forEach { print(it) }


        println("Hello World! a  is odd$stringType")


        if(numberType%2 != 0){
            println("Hello World! a  is odd")
        }
        else{
            println("Hello World! a is even")
        }

    }

    fun printAllStrings(vararg strings: String) {
        for (string in strings) {
            print(string)
        }
    }
