fun main() {
    thirdTask()
}

fun firstTask() {
    //there is no Console.Clear() or something. Hilarious.
    print("Enter number: ")

    try {
        val number = readln()
        println(number.first().digitToInt() + number.last().digitToInt())
    } catch (exception: Exception) {
        println("It is not a number")
        firstTask()
    }
}

fun secondTask() {
    var numberOfNumbersEntered = 0
    var sumOfNumbersEntered = 0
    var arithmeticMeanOfEnteredNumbers = 0.0
    println("Enter a number")
    var number: String
    while (true) {
        try {
            number = readln()
            sumOfNumbersEntered += number.toInt()
        } catch (exception: Exception) {
            println("Enter a NUMBER")
            continue
        }
        if (number == "0") break
        numberOfNumbersEntered++
        arithmeticMeanOfEnteredNumbers = sumOfNumbersEntered.toDouble() / numberOfNumbersEntered.toDouble()
    }

    println(
        "Number of numbers: $numberOfNumbersEntered" +
                "\nSum of numbers: $sumOfNumbersEntered" +
                "\nArithmetic mean of numbers: $arithmeticMeanOfEnteredNumbers"
    )
}

fun thirdTask() {
    val randomNumber = (0..10).random().toString()
    var userNumber : String
    print("Enter a number: ")

    while (true) {
        userNumber = readln()
        try {
            if (userNumber.toInt() < randomNumber.toInt()) println("Мало")
            if (userNumber.toInt() > randomNumber.toInt()) println("Много")
        } catch (exception: Exception) {
            println("ERROR ERROR ERROR")
        }
        if (userNumber == randomNumber) break
    }

    println("Угадал")
}

fun fourthTask() {

}
