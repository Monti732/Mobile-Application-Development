package lab1

import kotlin.math.pow
import kotlin.math.sqrt

class QuadraticEquation() {
  private fun sqr(n: Double): Double = n.pow(2)

  private fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

  private fun rootsNumber(discriminant: Double): Int =
    when {
      discriminant < 0.0 -> 0
      discriminant == 0.0 -> 1
      else -> 2
    }


  fun quadraticRoot(a: Double, b: Double, c: Double): Set<Any> {
    val discriminant = discriminant(a, b, c)
    val roots = mutableSetOf<Any>()
    if (rootsNumber(discriminant) == 0) return roots.apply { add("No roots") }
    return roots.apply {
      addAll(
        listOf(
          firstRoot(a, b, discriminant),
          secondRoot(a, b, discriminant)
        )
      )
    }
  }

  private fun firstRoot(a: Double, b: Double, discriminant: Double): Double = (-b - sqrt(discriminant)) / 2 * a

  private fun secondRoot(a: Double, b: Double, discriminant: Double): Double = (-b + sqrt(discriminant)) / 2 * a
}
