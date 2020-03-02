package com.machinedoll.wonderland

import scala.collection.mutable

class MaximumSubarray {

  def maxSubArray(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    var currentMax = nums(0)
    val mem = new mutable.HashMap[Tuple2[Int, Int], Int]()
    for (startIndex <- 0 to nums.length - 1) {
      for (endIndex <- startIndex to nums.length - 1) {
        currentMax = Math.max(currentMax, getLargestSum(startIndex, endIndex))
        mem.put(Tuple2(startIndex, endIndex), currentMax)
      }
    }

    def getLargestSum(startIndex: Int, endIndex: Int): Int = ???

    return currentMax
  }

  def maxSubArrayON(nums: Array[Int]): Int = {
    if (nums.length == 0) return -2147483648
    var maxArray = new Array[Int](nums.length)
    var currentMax = nums(0)
    maxArray(0) = nums(0)
    for (index <- 1 to nums.length - 1) {
      maxArray(index) = Math.max(nums(index), maxArray(index - 1) + nums(index))
      currentMax = Math.max(currentMax, maxArray(index))
    }
    currentMax
  }
}
