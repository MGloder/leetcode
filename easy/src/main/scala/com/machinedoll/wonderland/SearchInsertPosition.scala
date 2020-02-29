package com.machinedoll.wonderland

class SearchInsertPosition {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    for (index <- 0 to nums.length - 1) {
      if (nums(index) == target) {
        return index
      } else if (nums(index) > target) {
        return index
      }
    }
    nums.length
  }
}
