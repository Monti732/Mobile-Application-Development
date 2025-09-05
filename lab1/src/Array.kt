package lab1

import kotlin.Array

class Array(array: List<Int>) {
  private val _array = array

  fun sumOfPositives(): Double = _array.fold(0.0) { acc, i -> if (i < 0) return@fold acc else acc + i }

  fun productOfElements(): Double = _array.fold(1.0) { acc, i -> acc * i }

  fun arithmeticMeanOfElements(): Double = _array.sum().toDouble() / _array.size.toDouble()
}

