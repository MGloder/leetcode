package com.machinedoll.wonderland

import org.slf4j.LoggerFactory

object PalindromeNumber {
  def main(args: Array[String]): Unit = {
    val logger = LoggerFactory.getLogger("Palindrome Number")
    val x = isPalindrome(1010)
    logger.info(s"$x")
  }

  def isPalindrome(x: Int): Boolean = {
    if (x < 0) {
      return false
    }
    var reverse = x
    var digit = 0
    while (reverse != 0) {
      digit = digit * 10 + reverse % 10
      reverse = reverse / 10
    }
    if (digit == x) true else false
  }
}
