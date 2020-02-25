package com.machinedoll.wonderland

class LongestCommonPrefix {
  /*
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
   */
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.length == 0)
      return ""
    val targetString = strs(0)
    var result = ""
    for (index <- 0 to (targetString.length - 1)) {
      val c: Char = targetString(index)
      for (stringArrayIndex <- 0 to (strs.length - 1)) {
        if (strs(stringArrayIndex).length == index) {
          return result
        }
        if (strs(stringArrayIndex)(index) != c) {
          return result
        }
      }
      result += c
    }
    result
  }
}
