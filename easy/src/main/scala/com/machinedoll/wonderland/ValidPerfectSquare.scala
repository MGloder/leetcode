package com.machinedoll.wonderland

class ValidPerfectSquare {
  def isPerfectSquare(num: Int): Boolean = {
    for (i <- (0 to num)) {
      if (i * i == num) {
        return true
      } else if (i * i > num) {
        return false
      }
    }
    false
  }
}
