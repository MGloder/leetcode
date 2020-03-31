package com.machinedoll.wonderland

class StringToInteger {
  def myAtoi(str: String): Int = {
    val findValidStr = "^\\s*[-+]?[0-9]+.*".r
    val findNumbers = "^\\s*[-+]?[0-9]+".r
    var result: Long = 0
    str match {
      case findValidStr() => {
        val intStr = findNumbers.findAllIn(str).mkString
        var flag = 1
        for (i <- 0 until intStr.length) {
          val item = intStr.charAt(i)
          if (item == '-' || item == '+' || item == ' ') {
            if (item == '-') flag = -1
          } else {
            result = result * 10 + item.asDigit
            if (result * flag > Int.MaxValue) return Int.MaxValue
            else if (result * flag < Int.MinValue) return Int.MinValue
          }
        }
        result *= flag
        result.toInt
      }
      case _ => 0
    }
  }
}
