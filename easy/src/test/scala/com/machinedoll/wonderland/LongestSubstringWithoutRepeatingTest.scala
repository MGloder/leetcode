package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class LongestSubstringWithoutRepeatingTest extends AnyFunSuite {
  val checker = new LongestSubstringWithoutRepeating()
  test("abcabcbb is 3") {
    assert(checker.lengthOfLongestSubstring("abcabcbb") === 3)
  }
  test("\"\" is 0") {
    assert(checker.lengthOfLongestSubstring("") === 0)
  }

  test("bbbb is 1") {
    assert(checker.lengthOfLongestSubstring("bbbb") === 1)
  }

  test("pwwkew is 3") {
    assert(checker.lengthOfLongestSubstring("pwwkew") === 3)
  }
}
