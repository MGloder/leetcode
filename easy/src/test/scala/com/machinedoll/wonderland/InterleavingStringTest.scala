package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class InterleavingStringTest extends AnyFunSuite {
  val checker = new InterleavingString()
  test("aabcc, dbbca === aadbbcbcac") {
    assert(checker.isInterleave("aabcc", "dbbca", "aadbbcbcac") === true)
  }

  test("aabcc, dbbca, aadbbbaccc is false") {
    assert(checker.isInterleave("aabcc", "dbbca", "aadbbbaccc") === false)
  }

  test("a, b, a is false") {
    assert(checker.isInterleave("a", "b", "a") === false)
  }
}
