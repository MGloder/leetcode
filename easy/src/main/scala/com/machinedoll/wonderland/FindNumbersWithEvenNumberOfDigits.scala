package com.machinedoll.wonderland

class FindNumbersWithEvenNumberOfDigits {

  def isEven(num: Int): Boolean = num.toString.length % 2 == 0

  def findNumbers(nums: Array[Int]): Int = {
    var res = 0
    for (num <- nums) {
      if (isEven(num))
        res += 1
    }
    res
  }
}
