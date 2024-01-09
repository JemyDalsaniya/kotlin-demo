fun exceptionHandling(){

    val x = "a";
    val y = 0;
    try {
//        val z = x/y;
    } catch (e: ArithmeticException) {
        println(e)
    }
    //try as an expression
    val a: Int? = try { x.toInt() } catch (e: NumberFormatException) { 3 }
//    println(a)

    val i = 8
    val j = 2

    val result = divideOrZero(i, j) ?: -1
    println("Result: $result")
}

fun divideOrZero(x: Int, y: Int): Int {
    val result = try {
        x / y
    } catch (e: ArithmeticException) {
        0
    }
    return result
}

