// Function to find the greatest common divisor (GCD) of two numbers
fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}

// Function to find the least common multiple (LCM) of two numbers
fun lcm(a: Int, b: Int): Int {
    return if (a == 0 || b == 0) 0 else Math.abs(a * b) / gcd(a, b)
}

// Function to find the least common multiple (LCM) of an array of numbers
fun lcmOfArray(numbers: IntArray): Int {
    var result = numbers[0]
    for (i in 1 until numbers.size) {
        result = lcm(result, numbers[i])
    }
    return result
}

fun main() {
    val numbers = intArrayOf(4, 6, 8) // Example numbers
    val result = lcmOfArray(numbers)
    println("LCM of ${numbers.joinToString()} is: $result")
}
