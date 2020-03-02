import com.machinedoll.wonderland.MaximumSubarray
import org.scalatest.funsuite.AnyFunSuite

class MaximumSubArrayTest extends AnyFunSuite {
  val checker = new MaximumSubarray()
  test("-2 1 -3 is 1") {
    assert(checker.maxSubArrayON(Array(-2, 1, -3)) === 1)
  }

  test("[-2 1 -3 4] is 4") {
    assert(checker.maxSubArrayON(Array(-2, 1, -3, 4)) === 4)
  }

  test("[-2, 1, -3, 4, -1, 2, 1, -5, 4] is 6") {
    assert(checker.maxSubArrayON(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) === 6)
  }

  test("[] is 0") {
    assert(checker.maxSubArrayON(Array()) === -2147483648)
  }
}
