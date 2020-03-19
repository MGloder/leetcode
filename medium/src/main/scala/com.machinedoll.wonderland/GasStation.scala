package com.machinedoll.wonderland

class GasStation {


  /*
    There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

    You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

    Return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.

    Note:

    If there exists a solution, it is guaranteed to be unique.
    Both input arrays are non-empty and have the same length.
    Each element in the input arrays is a non-negative integer.
     */
  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    val circularLength = gas.length
    val difference: Array[Int] = new Array[Int](circularLength)


    for (i <- (0 to circularLength - 1)) {
      difference(i) = gas(i) - cost(i)
    }
    val sum = difference.reduce(_ + _)
    if (sum < 0) {
      return -1
    }

    def checkIfValid(startIndex: Int): Boolean = {
      var traversIndex = startIndex
      var currentVolumn = difference(startIndex)
      do {
        if (traversIndex < circularLength - 1) {
          traversIndex = traversIndex + 1
        } else {
          traversIndex = 0
        }
        currentVolumn += difference(traversIndex)
        if (currentVolumn < 0) {
          return false
        }
      } while (traversIndex != startIndex)
      true
    }

    val sortedDifference = difference.zipWithIndex.sortWith((i, j) => i._2 > j._2)
    sortedDifference.map(candidate => {
      if (checkIfValid(candidate._2)) return candidate._2
    })
    -1
  }
}
