class EnumExample {
    enum class Color {
        RED, GREEN, BLUE
    }

    fun runExample() {
        val selectedColor = getColor()

        when (selectedColor) {
            Color.RED -> println("red")
            Color.GREEN -> println("green")
            Color.BLUE -> println("blue")
            // 'else' is not required because all cases are covered
        }

        when (selectedColor) {
            Color.RED -> println("red") // no branches for GREEN and BLUE
            else -> println("not red") // 'else' is required
        }
    }

    // Replace this with your actual logic to get a Color
    private fun getColor(): Color {
        // Replace this with your actual implementation
        return Color.RED
    }
}

fun main() {
    val enumExample = EnumExample()
    enumExample.runExample()
}
