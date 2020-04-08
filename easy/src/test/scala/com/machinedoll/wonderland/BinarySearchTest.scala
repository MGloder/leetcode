package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class BinarySearchTest extends AnyFunSuite {
  val checker = new BinarySearch()
  test("-1,0,3,5,9,12 (9) is 4") {
    assert(checker.search(Array(-1, 0, 3, 5, 9, 12), 9) === 4)
  }

  test("-1,0,3,5,9,12 (9) is 2") {
    assert(checker.search(Array(-1, 0, 3, 5, 9, 12), 2) === -1)
  }

  test("2, 5 (5) is 1") {
    assert(checker.search(Array(2, 5), 5) === 1)
  }
}
