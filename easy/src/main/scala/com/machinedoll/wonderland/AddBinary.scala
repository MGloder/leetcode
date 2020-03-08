package com.machinedoll.wonderland

class AddBinary {
  def addBinary(a: String, b: String): String = {
    val aReverse = a.reverse
    val bReverse = b.reverse
    var carry: Int = 0
    var aIndex: Int = 0
    var bIndex: Int = 0
    var res: StringBuilder = new StringBuilder
    while (true) {
      val aInt = if (aIndex < a.length) aReverse(aIndex).toString.toInt else 0
      val bInt = if (bIndex < b.length) bReverse(bIndex).toString.toInt else 0
      val tempRes = aInt + bInt + carry
      tempRes match {
        case 3 => {
          carry = 1
          res.append(1)
        }
        case 2 => {
          carry = 1
          res.append(0)
        }
        case 1 => {
          carry = 0
          res.append(1)
        }
        case _ => {
          carry = 0
          res.append(0)
        }
      }
      aIndex += 1
      bIndex += 1

      if (aIndex >= a.length && bIndex >= b.length) {
        if (carry == 1) {
          res.append(1)
        }
        return res.reverse.mkString
      }
    }
    return ""
  }

}
