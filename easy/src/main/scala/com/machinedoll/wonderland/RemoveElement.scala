package com.machinedoll.wonderland

class RemoveElement {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val removeInt = `val`
    var currentIndex = 0
    for (index <- 0 to nums.length - 1) {
      if (nums(index) != removeInt) {
        nums(currentIndex) = nums(index)
        currentIndex += 1
      }
    }
    currentIndex
  }
}
