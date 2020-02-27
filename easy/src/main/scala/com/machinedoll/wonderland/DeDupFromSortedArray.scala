package com.machinedoll.wonderland

class DeDupFromSortedArray {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    var current = nums(0)
    var lengthIndex = 1
    for (index <- 1 to nums.length - 1) {
      if (nums(index) != current ) {
        current = nums(index)
        nums(lengthIndex) = current
        lengthIndex += 1
      }
    }
    lengthIndex
  }
}
