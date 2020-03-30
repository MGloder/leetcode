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

  test("aabcc, dbbca === aadbbcbcac dp") {
    assert(checker.isInterleaveDP("aabcc", "dbbca", "aadbbcbcac") === true)
  }

  test("aabcc, dbbca, aadbbbaccc is false dp") {
    assert(checker.isInterleaveDP("aabcc", "dbbca", "aadbbbaccc") === false)
  }

  test("a, b, a is false dp") {
    assert(checker.isInterleaveDP("a", "b", "a") === false)
  }
}
