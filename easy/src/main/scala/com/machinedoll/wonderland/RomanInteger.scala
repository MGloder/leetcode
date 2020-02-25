package com.machinedoll.wonderland

import scala.collection.immutable.HashMap

object RomanInteger {

  /*
  * |Symbol       Value
    |I             1
    |V             5
    |X             10
    |L             50
    |C             100
    |D             500
    |M             1000
    |
    |I can be placed before V (5) and X (10) to make 4 and 9.
    |X can be placed before L (50) and C (100) to make 40 and 90.
    |C can be placed before D (500) and M (1000) to make 400 and 900
  * */

  val valueMap: Map[Char, Int] =
    HashMap[Char, Int](
      'I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000)

  val relationMap: Map[Char, Set[Char]] =
    HashMap[Char, Set[Char]](
      'I' -> Set('V', 'X'),
      'X' -> Set('L', 'C'),
      'C' -> Set('D', 'M')
    )


  def romanToInt(s: String): Int = {
    var resultValue = 0
    for (index <- 0 to s.length - 1) {
      if (relationMap.contains(s(index)) && index != s.length - 1 && relationMap.get(s(index)).get.exists(c => {
        c == s(index + 1)
      })) {
        resultValue -= valueMap.get(s(index)).get
      } else {
        resultValue += valueMap.get(s(index)).get
      }
    }
    resultValue
  }
}
