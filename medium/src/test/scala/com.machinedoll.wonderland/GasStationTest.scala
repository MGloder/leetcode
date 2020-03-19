package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class GasStationTest extends AnyFunSuite {
  val checker = new GasStation
  test("[2, 3, 4], [3, 4, 3] is -1") {
    assert(checker.canCompleteCircuit(Array(2, 3, 4), Array(3, 4, 3)) === -1)
  }

  test("[1, 2, 3, 4, 5], [3, 4, 5, 1, 2] is 3") {
    assert(checker.canCompleteCircuit(Array(1, 2, 3, 4, 5), Array(3, 4, 5, 1, 2)) === 3)
  }

  test("[5,8,2,8], [6,5,6,6] is 3") {
    assert(checker.canCompleteCircuit(Array(5, 8, 2, 8), Array(6, 4, 6, 6)) === 3)
  }

}
