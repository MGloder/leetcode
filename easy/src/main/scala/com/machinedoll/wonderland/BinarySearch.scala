package com.machinedoll.wonderland

import scala.annotation.tailrec

class BinarySearch {
  def search(nums: Array[Int], target: Int): Int = {
    @tailrec
    def binaryS(lower: Int, higher: Int): Int = {
      val midIndex: Int = (lower + higher) / 2
      if (midIndex == lower || midIndex == higher) {
        if (nums(midIndex) == target) return midIndex
        if (nums(lower) == target) return lower
        if (nums(higher) == target) return higher
        return -1
      }
      if (nums(midIndex) == target) {
        midIndex
      } else if (nums(midIndex) < target) {
        binaryS(midIndex, higher)
      } else {
        binaryS(lower, midIndex)
      }
    }
    binaryS(0, nums.length - 1)
  }
}
