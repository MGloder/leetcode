package com.machinedoll.wonderland

import scala.collection.mutable

class LongestSubstringWithoutRepeating {


  def lengthOfLongestSubstring(s: String): Int = {
    var maxLength = 0 // max length
    var windowSize = 0 // window size
    var lastStartIndex = 0
    var occurs = new mutable.HashMap[Char, Int]() // char with index
    var currentIndex = 0

    while (currentIndex < s.length) {
      if (!occurs.contains(s(currentIndex))) {
        windowSize += 1
        if (maxLength < windowSize) {
          maxLength = windowSize
        }
        occurs.put(s(currentIndex), currentIndex)

      } else {
        // update window size
        // remove hash table
        val previousIndex = occurs.get(s(currentIndex)).get
        for (index <- (lastStartIndex to previousIndex)) {
          occurs.remove(s(index))
          windowSize -= 1
        }
        lastStartIndex = previousIndex + 1
        windowSize += 1
        occurs.put(s(currentIndex), currentIndex)
      }
      currentIndex += 1
    }
    maxLength
  }
}
