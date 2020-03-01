package com.machinedoll.wonderland

class CountAndSay {

  def say(result: Seq[String]): String = {
    result.reduce(_ + _)
  }

  def count(current: String): Seq[String] = {
    var count: Int = 1
    var index: Int = 0
    var currentChar: Char = current(index)
    var result = Seq[String]()
    while (index < current.length) {
      if (index + 1 == current.length) {
        return result ++ Seq(count.toString + currentChar)
      } else if (currentChar == current(index + 1)) {
        count += 1
        index += 1
      } else {
        result = result ++ Seq(count.toString + currentChar)
        index += 1
        currentChar = current(index)
        count = 1
      }
    }
    result
  }

  def countAndSay(n: Int): String = {
    if (n > 30 || n < 0) {
      return ""
    }
    var current: String = "1"
    for (countIndex <- 2 to n) {
      val countResult = count(current)
      current = say(countResult)
    }
    current
  }
}
