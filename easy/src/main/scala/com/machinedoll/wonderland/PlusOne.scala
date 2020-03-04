package com.machinedoll.wonderland

class PlusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    var res = digits
    var sign = 1
    var startIndex = digits.length - 1
    while (startIndex >= 0) {
      if (sign == 1) {
        if (res(startIndex) == 9) {
          res(startIndex) = 0
          sign = 1
        } else {
          res(startIndex) += 1
          sign = 0
        }
      }
      if (sign == 0) {
        return res
      }
      startIndex -= 1
    }
    if (sign == 1) {
      1 +: res
    } else {
      res
    }
  }
}
