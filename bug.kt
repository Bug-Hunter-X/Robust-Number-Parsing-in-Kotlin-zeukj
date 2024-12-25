```kotlin
fun processData(input: String): Int {
    val numbers = input.split(',').map { it.trim().toInt() }
    return numbers.sum()
}

fun main() {
    val input = "1, 2, 3, a, 5"
    try {
        val result = processData(input)
        println("Sum: $result")
    } catch (e: NumberFormatException) {
        println("Error: Invalid input format")
    }
}
```