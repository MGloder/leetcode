package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class FindNumbersWithEvenNumberOfDigitsTest extends AnyFunSuite {
  val checker = new FindNumbersWithEvenNumberOfDigits()
  test("[12,345,2,6,7896] is 2") {
    assert(checker.findNumbers(Array(12,345,2,6,7896)) === 2 )
  }

}
