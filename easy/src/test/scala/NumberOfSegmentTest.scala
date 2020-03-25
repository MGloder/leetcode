import com.machinedoll.wonderland.NumberOfSegment
import org.scalatest.funsuite.AnyFunSuite

class NumberOfSegmentTest extends AnyFunSuite {
  val checker = new NumberOfSegment()
  test("Hello, my name is John is 5") {
    assert(checker.countSegments("Hello, my name is John") === 5)
  }

  test("Hello is 1") {
    assert(checker.countSegments("Hello, ") === 1)
  }

  test("\"\" 0") {
    assert(checker.countSegments("") === 0)
  }

  test("\", , , ,        a, eaefa\" is  6") {
    assert(checker.countSegments(", , , ,        a, eaefa") === 6)
  }

  test("\"    foo    bar\" is  2") {
    assert(checker.countSegments("    foo    bar") === 2)
  }
}
