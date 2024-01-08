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
    var x = 4
    var y = 5
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

    for (i in 1..3) {
        println(i)
        println()
    }
    for (i in 6 downTo 0 step 2) {
        println(i)

    }
}