package com.machinedoll.wonderland

import scala.collection.mutable
import scala.collection.immutable

class ValidParentheses {
  /*
    For loop is better
   */
  def isValid(s: String): Boolean = {
    var parenthesesStack: mutable.Stack[Char] = mutable.Stack()
    val parentheseMap: Map[Char, Char] = immutable.HashMap[Char, Char]('{' -> '}', '(' -> ')', '[' -> ']')
    def recursiveValid(s: String): Boolean = {
      if (s.length == 0) {
        if (parenthesesStack.isEmpty) {
          return true
        } else {
          return false
        }
      } else if (parentheseMap.contains(s(0))) {
        parenthesesStack.push(s(0))
        if (recursiveValid(s.substring(1))) {
          return true
        } else {
          return false
        }
      } else {
        if (parenthesesStack.isEmpty)
          return false
        val topChar = parenthesesStack.pop()
        if (s(0) == parentheseMap.get(topChar).get) {
            recursiveValid(s.substring(1))
        } else {
          return false
        }
      }
    }
    return recursiveValid(s)
  }
}
