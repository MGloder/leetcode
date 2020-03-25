package com.machinedoll.wonderland

class NumberOfSegment {
  def countSegments(s: String): Int = {
    if (s.length == 0)
      return 0
    s.split(s"[\\t|\\s|\\r]+").filterNot(_ == "").length
  }
}
