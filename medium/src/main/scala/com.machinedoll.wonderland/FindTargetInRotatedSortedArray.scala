package com.machinedoll.wonderland

class FindTargetInRotatedSortedArray {
  def search(nums: Array[Int], target: Int): Boolean = {
    // idiot way
    //    nums.contains(target)
    def foo(nums: Array[Int]): Boolean = {
      if (nums.length == 0) {
        return false
      }
      val mid = nums.length / 2
      if (nums(mid) == target) // equal to target
        return true
      if (nums(mid) == nums.head && nums(mid) == nums.last) { // dont know which way
        return foo(nums.slice(1, nums.length - 1))
      }
      if (nums(mid) >= nums(0)) {
        if (target < nums(mid) && target >= nums.head) { // go left
          return foo(nums.slice(0, mid))
        } else { // go right
          return foo(nums.slice(mid, nums.length))
        }
      } else {
        if (target > nums(mid) && target <= nums.last) { // go left
          return foo(nums.slice(mid, nums.length))
        } else { // go right
          return foo(nums.slice(0, mid))
        }
      }
    }

    foo(nums)
  }
}