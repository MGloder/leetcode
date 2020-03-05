import com.machinedoll.wonderland.ClimbStairs
import org.scalatest.funsuite.AnyFunSuite

class ClimbStairsTest extends AnyFunSuite {
  val checker = new ClimbStairs()
  test("0 is 1") {
    assert(checker.climbStairs(0) === 1)
  }

  test("1 is 1") {
    assert(checker.climbStairs(1) === 1)
  }

  test("2 is 2") {
    assert(checker.climbStairs(2) === 2)
  }

  test("10 is 89") {
    assert(checker.climbStairs(10) === 89)
  }


}
