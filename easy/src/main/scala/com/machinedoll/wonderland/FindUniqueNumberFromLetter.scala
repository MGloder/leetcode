package com.machinedoll.wonderland

class FindUniqueNumberFromLetter {

  /*
        a = 1, z = 26
        input: "1234567"
        output: number of unique solution

        input[i] = independent + two digit result
       */
  def solution(input: String): Int = {
    var dp0 = 1
    var dp1 = 1
    for (charIndex <- (1 to input.length - 1)) {
      val temp = dp1
      dp1 = {
        var temp = if (input(charIndex).getNumericValue != 0) {
          dp1
        } else {
          0
        }
        var temp2 = if ((input(charIndex - 1).getNumericValue != 0) && (input(charIndex - 1).getNumericValue * 10 + input(charIndex).getNumericValue) <= 26) {
          dp0
        } else {
          0
        }
        temp + temp2
      }
      dp0 = temp
    }
    dp1
  }
}
