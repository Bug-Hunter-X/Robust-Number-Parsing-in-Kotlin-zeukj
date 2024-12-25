```kotlin
fun processData(input: String): Int? {
    val numbers = input.split(',').mapNotNull { it.trim().toIntOrNull() }
    return if (numbers.size != input.split(',').size) null else numbers.sum() 
}

fun main() {
    val input = "1, 2, 3, a, 5"
    val result = processData(input)
    if (result != null) {
        println("Sum: $result")
    } else {
        println("Error: Invalid input format - Non-numeric value encountered")
    }
}
```