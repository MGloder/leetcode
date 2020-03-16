package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class FindTargetRotatedSortedArrayTest extends AnyFunSuite {
  val checker = new FindTargetInRotatedSortedArray()
  test("[5,6,7,8,0,1,2,3,4], 4 == true") {
    assert(checker.search(Array(5, 6, 7, 8, 0, 1, 2, 3, 4), 4) === true)
  }

  test("[5,6,8,0,1,2,3,4], 7 == false") {
    assert(checker.search(Array(5, 6, 8, 0, 1, 2, 3, 4), 7) === false)
  }

  test("[], 8 == false") {
    assert(checker.search(Array[Int](), 8) === false)
  }

  test("[1,2,3,4,5,6,7,8],1") {
    assert(checker.search(Array(1, 2, 3, 4, 5, 6, 7, 8), 1) === true)
  }

  test("[2,2,2,0,1],0") {
    assert(checker.search(Array(2, 2, 2, 0, 1), 0) === true)
  }

  test("[2,0,1,1],0") {
    assert(checker.search(Array(2, 0, 1, 1), 0) === true)
  }
}
