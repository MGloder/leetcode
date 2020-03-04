import com.machinedoll.wonderland.PlusOne
import org.scalatest.funsuite.AnyFunSuite

class PlusOneTest extends AnyFunSuite {
  val checker = new PlusOne()
  test("[1, 2, 3] is [1,2,4]") {
    assert(checker.plusOne(Array(1, 2, 3)) === Array(1, 2, 4))
  }

  test("[8,9,9] is [9,0,0]") {
    assert(checker.plusOne(Array(8, 9, 9)) === Array(9, 0, 0))
  }

  test("[9] is [1, 0]") {
    assert(checker.plusOne(Array(9)) === Array(1, 0))
  }

}
