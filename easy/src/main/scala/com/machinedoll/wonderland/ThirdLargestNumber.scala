package com.machinedoll.wonderland

class ThirdLargestNumber {
  def thirdMax(nums: Array[Int]): Int = {
    var largest = Long.MinValue
    var secondLarget = Long.MinValue
    var thirdLargest = Long.MinValue
    for (i <- (0 to nums.length - 1)) {
      if (largest <= nums(i)) {
        if (largest != nums(i)) {
          thirdLargest = secondLarget
          secondLarget = largest
          largest = nums(i)
        }
      } else if (secondLarget <= nums(i)) {
        if (secondLarget != nums(i)) {
          thirdLargest = secondLarget
          secondLarget = nums(i)
        }
      } else if (thirdLargest <= nums(i)) {
        thirdLargest = nums(i)
      }
    }

    if (thirdLargest == Long.MinValue) {
      return largest.toInt
    }
    thirdLargest.toInt
  }
}
