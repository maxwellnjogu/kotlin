fun main() {
    val num1 = 10
    val num2 = 5
    val num3 = 8

    val max = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    val min = if (num1 <= num2 && num1 <= num3) {
        num1
    } else if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    println("Maximum of $num1, $num2, and $num3 is: $max")
    println("Minimum of $num1, $num2, and $num3 is: $min")
}
