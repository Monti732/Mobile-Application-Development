package lab1

class Utility {
  companion object {
    fun fillArray(): List<Double> {
      var length = 0
      val array = mutableListOf<Double>()
      print("Enter length of array: ")
      try {
        length = readln().toInt()
      } catch (exception: Exception) {
        println("NUMBER(int), not char or string")
      }

      println("Enter elements of array")
      var iterator = 0

      while (iterator < length) {
        val number = try {
          readln().toDouble()
        } catch (exception: Exception) {
          println("NO NO NO, nuuuuumber")
          continue
        }
        array.add(number)
        iterator++
      }

      return array
    }
  }
}