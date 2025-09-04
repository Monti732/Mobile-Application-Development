class FifthTaskClass {
  var array = arrayListOf<Int>()

  fun runTask() {
    array = fillArray()
    println("Numbers greater than neighbours: ${findGreaterNumberThanNeighbours()} " +
            "\nProduct: ${calculateProduct()} " +
            "\nMax element: ${array.max()} " +
            "\nMin element: ${array.min()}")
  }

  fun findGreaterNumberThanNeighbours(): ArrayList<Int> {
    var greaterNumbers = ArrayList<Int>()
    for (i in 1..<array.size - 1) {
      if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
        greaterNumbers.add(array[i])
      }
    }

    return greaterNumbers
  }

  fun calculateProduct(): Long {
    var product = 1.toLong()
    for (i in 0..<array.size) {
      product *= array[i]
    }

    return product
  }

  fun fillArray(): ArrayList<Int> {
    var length = 0

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
        readln().toInt()
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