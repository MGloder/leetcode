package com.machinedoll.wonderland

class LongestWordInDictionary {
  def longestWord(words: Array[String]): String = {
    var wordSet: Set[String] = Set(words: _*)
    var word: String = words(0)
    for (index <- (0 to words.length - 1)) {
      if (wordSet.contains(words(index).substring(0, words(index).length - 1))) {
        if (words(index).length > word.length) {
          word = words(index)
        } else if (words(index).length == word.length) {
          //TODO lexicographically
//          if (words(index).compareTo(word) < 0) {
//            word = words(index)
//          }
        }
      }
    }
    word
  }
}
