package com.machinedoll.wonderland

import org.slf4j.LoggerFactory

object ReverseInteger {
  def main(args: Array[String]): Unit = {
    val logger = LoggerFactory.getLogger("reverse integer")
    logger.info(s"reverse integer ${reverseInteger(1563847412)}")
  }

  def reverseInteger(x: Int): Int = {
    var digit = x
    var newX: Long = 0
    while (digit != 0) {
      newX = newX * 10 + digit % 10
      digit = digit / 10
      println(s"$newX, $digit")
    }

    if (newX > 0x7fffffff || newX < 0x80000000) {
      0
    } else {
      newX.toInt
    }
  }

}
