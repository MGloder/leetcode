package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class StringToIntegerTest extends AnyFunSuite {
  val checker = new StringToInteger()
  test("\"42\" is 42") {
    assert(checker.myAtoi("42") === 42)
  }

}
