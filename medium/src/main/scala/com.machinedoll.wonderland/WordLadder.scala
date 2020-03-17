package com.machinedoll.wonderland

class WordLadder {
  def distance(s1: String, s2: String): Boolean = {
    var diff = 0
    for (index <- (0 to s1.size - 1)) {
      if (s1(index) != s2(index)) {
        diff += 1
        if (diff > 1) {
          return false
        }
      }
    }
    return true
  }


  def ladderLength(beginWord: String, endWord: String, wordList: List[String]): Int = {
    // to slow TODO add preprocessing befor loop
    def findPath(currentWord: String, parentSet: Set[String], availableSet: Set[String]): Integer = {
      if (currentWord == endWord) {
        return parentSet.size + 1
      }
      var shortest = Int.MaxValue
      for (word <- availableSet) {
        if (distance(currentWord, word)) {
          val res = findPath(word, parentSet + word, availableSet - word)
          if (res != Int.MaxValue) {
            shortest = Math.min(res, shortest)
          }
        }
      }
      shortest
    }

    val res = findPath(beginWord, Set[String](), wordList.toSet - beginWord)
    if (res == Int.MaxValue) {
      0
    } else {
      res
    }
  }

}
