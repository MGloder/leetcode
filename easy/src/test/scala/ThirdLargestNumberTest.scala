import com.machinedoll.wonderland.ThirdLargestNumber
import org.scalatest.funsuite.AnyFunSuite

class ThirdLargestNumberTest extends AnyFunSuite {
  val checker = new ThirdLargestNumber()
  test("[1,2,3] is 1") {
    assert(checker.thirdMax(Array(1, 2, 3)) === 1)
  }

  test("[2,3] is 3") {
    assert(checker.thirdMax(Array(2, 3)) === 3)
  }

  test("[1,2,2,3] is 1") {
    assert(checker.thirdMax(Array(1, 2, 2, 3)) === 1)
  }

  test("[2, 2, 3] is 3") {
    assert(checker.thirdMax(Array(2, 2, 3)) == 3)
  }

  test("[5,3,3] is 5") {
    assert(checker.thirdMax(Array(5, 3, 3)) == 5)
  }

  test("[1,2, -2147483648] is -2147483648") {
    assert(checker.thirdMax(Array(2, 1, -2147483648)) == -2147483648)
  }
}
