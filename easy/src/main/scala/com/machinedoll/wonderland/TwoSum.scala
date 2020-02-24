package com.machinedoll.wonderland

import org.slf4j.LoggerFactory

import scala.collection.mutable

object TwoSum {
  def main(args: Array[String]): Unit = {
    val logger = LoggerFactory.getLogger("Two Sum")
    val input = Array(1, 2, 3, 4)
    val target = 4
    logger.info("Prepare Two Sum")
//    val result = twoSum(input, target)
    logger.info("Two sum with hashmap")
    val result = twoSumWithHashMap(input, target)
    logger.info(s"Two sum result: ${result.toList}")
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- 0 to (nums.length - 2)) {
      for (j <- i + 1 to (nums.length - 1)) {
        if (nums(i) + nums(j) == target) {
          return Array(i, j)
        }
      }
    }
    Array(0, 0)
  }

  def twoSumWithHashMap(nums: Array[Int], target: Int): Array[Int] = {
    val dict = new mutable.HashMap[Int, Int]()
    for (index <- 0 to (nums.length - 1)) {
      if (dict.contains(target - nums(index))) {
        return Array(dict.get(target - nums(index)).get, index)
      } else {
        dict.put(nums(index), index)
      }
    }
    Array(0, 0)
  }
}
