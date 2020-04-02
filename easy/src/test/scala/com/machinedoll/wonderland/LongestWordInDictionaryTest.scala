package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class LongestWordInDictionaryTest extends AnyFunSuite {
  val checker = new LongestWordInDictionary()
  test("[\"w\",\"wo\",\"wor\",\"worl\", \"world\"] is world") {
    assert(checker.longestWord(Array("w", "wo", "wor", "worl", "world")) === "world")
  }

  test("[\"a\", \"banana\", \"app\", \"appl\", \"ap\", \"apply\", \"apple\"] is apple") {
    assert(checker.longestWord(Array("a", "banana", "app", "appl", "ap", "apply", "apple")) === "apple")
  }

  test("[\"m\", \"mo\", \"moc\", \"moch\", \"mocha\", \"l\", \"la\", \"lat\", \"latt\", \"latte\", \"c\", \"ca\", \"cat\"] is latte") {
    assert(checker.longestWord(Array("m", "mo", "moc", "moch", "mocha", "l", "la", "lat", "latt", "latte", "c", "ca", "cat")) === "latte")
  }

  test("[\"yo\",\"ew\",\"fc\",\"zrc\",\"yodn\",\"fcm\",\"qm\",\"qmo\",\"fcmz\",\"z\",\"ewq\",\"yod\",\"ewqz\",\"y\"] is yodn") {
    assert(checker.longestWord(Array("yo", "ew", "fc", "zrc", "yodn", "fcm", "qm", "qmo", "fcmz", "z", "ewq", "yod", "ewqz", "y")) === "yodn")
  }
}
