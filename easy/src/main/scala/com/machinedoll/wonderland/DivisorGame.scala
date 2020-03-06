package com.machinedoll.wonderland

class DivisorGame {
  def divisorGame(N: Int): Boolean = {
    if (N < 2) return false
    val resultArray = new Array[Boolean](N + 1)
    resultArray(1) = false
    resultArray(2) = true
    resultArray(0) = false
    var current = 3
    while (current <= N) {
      var tester = 1
      resultArray(current) = false
      while (tester < current) {
        if (current % tester == 0) {
          if (resultArray(current - tester) == false) {
            resultArray(current) = true
            tester = current
          }
        }
        tester += 1
      }
      current += 1
    }
    resultArray(N)
  }
}
