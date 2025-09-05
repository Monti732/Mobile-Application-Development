package lab1

import kotlin.math.sqrt

fun main() {
  val test = QuadraticEquation()
  println(test.quadraticRoot(4.0,0.0,8.0))
}

fun firstTask() {
  //there is no Console.Clear() or something. Hilarious.
  print("Enter number: ")

  while (true) {
    try {
      val number = readln()
      println(number.first().digitToInt() + number.last().digitToInt())
    } catch (exception: Exception) {
      println("It is not a number")
      continue
    }
    break
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
  var userNumber: String
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

fun sieveOfEratosthenes(n: Int): List<Int> {
  val isPrime = BooleanArray(n + 1) { true }
  isPrime[0] = false
  if (n >= 1) isPrime[1] = false

  for (i in 2..sqrt(n.toDouble()).toInt()) {
    if (isPrime[i]) {
      for (j in i * i..n step i) {
        isPrime[j] = false
      }
    }
  }

  return (2..n).filter { isPrime[it] }
}

fun fourthTask() {
  var number: Int
  while (true) {
    print("Enter number: ")
    number = readln().toIntOrNull() ?: run {
      println("NUMBER")
      continue
    }
    break
  }
  println("Primes to $number ${sieveOfEratosthenes(number)}")
}