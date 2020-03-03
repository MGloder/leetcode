package com.machinedoll.wonderland

class LengthOfLastWord {
  def lengthOfLastWord(s: String): Int = {
    val splitedArray = s.split(" ")
    if (splitedArray.size == 0) return 0
    splitedArray(splitedArray.length - 1).length
  }
}
