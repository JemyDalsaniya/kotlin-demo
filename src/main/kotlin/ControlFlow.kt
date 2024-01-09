fun controlFlow() {
    val a = 2
    val b = 3


    var max = a
    if (a < b) max = b

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b

    // You can also use `else if` in expressions:
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b


    println("max is $max")
    println("maxOrLimit is $maxOrLimit")


    // it will take last statement as it's value
    val max2 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    //when example
    val x = 1
    val y = 5
    val s = 42
    val z = "42"
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    when {
        x%2 != 0 -> println("x is odd")
        y%2 != 0 -> println("y is even")
        else -> println("x+y is odd")
    }

    //when with enum example
    val enumExample = EnumExample()
    enumExample.runExample()

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    //This will convert z to int and check if it's same as x or not
    when (x) {
        z.toInt() -> println("s encodes x")
        else -> println("s does not encode x")
    }

    //to check data type
    println("method returns : "+hasPrefix("hello"))

    val validNumbers = arrayOf(1,2,3,4)
    when (x) {
        in 2..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
    for (i in 1..3) {
        if ( i == 2)
        continue
//        println(i)
//        println()
    }
    for (i in 6 downTo 0 step 2) {
//        println(i)
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 4) break@loop
            println("i: " + i +"j: "+ j)
        }
    }

    //implicit and explicit label example
    explicitLabelExample()
    implicitLabelExample()

}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("he")
    else -> false
}
fun implicitLabelExample() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with implicit label")
}
fun explicitLabelExample() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with explicit label")
}



