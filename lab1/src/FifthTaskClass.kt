package lab1

class FifthTaskClass {
  var array = listOf<Double>()

  fun runTask() {
    array = Utility.fillArray()
    println(
      "Numbers greater than neighbours: ${findGreaterNumberThanNeighbours()} " +
              "\nProduct: ${calculateProduct()} " +
              "\nMax element: ${array.max()} " +
              "\nMin element: ${array.min()}"
    )
  }

  fun findGreaterNumberThanNeighbours(): List<Double> {
    var greaterNumbers = mutableListOf<Double>()
    for (i in 1..<array.size - 1) {
      if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
        greaterNumbers.add(array[i])
      }
    }

    return greaterNumbers
  }

  fun calculateProduct(): Double = array.fold(1.0) { acc, i -> acc * i }
}