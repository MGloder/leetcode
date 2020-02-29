package com.machinedoll.wonderland

class FindDuplicateNumber {
  def findDuplicate(nums: Array[Int]): Int = {
    var tortoise = nums(0)
    var hare = nums(0)
    try {
      while (true) {
        tortoise = nums(tortoise)
        hare = nums(nums(hare))
        if (tortoise == hare) {
          throw new Exception("break")
        }
      }
    } catch {
      case ex: Exception => println("-")
    }

    var ptr1 = nums(0)
    var ptr2 = tortoise
    while (ptr1 != ptr2) {
      ptr1 = nums(ptr1)
      ptr2 = nums(ptr2)
    }
    return ptr1
  }
}
