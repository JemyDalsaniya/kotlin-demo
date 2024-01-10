fun collectionsExample() {

    //List example
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("This list has ${readOnlyShapes.count()} items")
    println("circle" in readOnlyShapes)


    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    //casting example
    val shapesLocked: List<String> = shapes

    println(shapes)
    println(shapesLocked)


    //Set Example
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    val fruitLocked: Set<String> = fruit
    fruit.add("dragonfruit")    // Add "dragonfruit" to the set
    println(fruit)
    fruit.remove("dragonfruit")

    println(readOnlyFruit)
    println("This set has ${readOnlyFruit.count()} items")
    println("banana" in readOnlyFruit)


    //Map Example
    val readOnlyJuiceMenu = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)


    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    juiceMenu.put("coconut", 150) // Add key "coconut" with value 150 to the map
    println(juiceMenu)
    juiceMenu.remove("orange")
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println("orange" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)




}
