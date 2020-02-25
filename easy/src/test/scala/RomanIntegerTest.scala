import com.machinedoll.wonderland.RomanInteger
import org.scalatest.funsuite.AnyFunSuite

class RomanIntegerTest extends AnyFunSuite {
  test("III is return integer 3") {
    assert(RomanInteger.romanToInt("III") === 3)
  }

  test("VI is return 6") {
    assert(RomanInteger.romanToInt("VI") === 6)
  }

  test("IVI is 5") {
    assert(RomanInteger.romanToInt("IVI") === 5)
  }

  test("LVIII is 58") {
    assert(RomanInteger.romanToInt("LVIII") === 58)
  }

  test("MCMXCIV is 1994") {
    assert(RomanInteger.romanToInt("MCMXCIV") === 1994)
  }

}
