import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите натуральное число: ")
    val number = scanner.nextInt()

    val binary = convertToBinary(number)
    println("Число $number в двоичной системе: $binary")
}

fun convertToBinary(number: Int): String {
    if (number == 0) {
        return "0"
    }

    var num = number
    var binary = ""
    while (num > 0) {
        binary = (num % 2).toString() + binary
        num /= 2
    }

    return binary
}
