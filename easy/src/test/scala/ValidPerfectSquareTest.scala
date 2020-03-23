import com.machinedoll.wonderland.ValidPerfectSquare
import org.scalatest.funsuite.AnyFunSuite

class ValidPerfectSquareTest extends AnyFunSuite {
  val checker = new ValidPerfectSquare()
  test("16 is true") {
    assert(checker.isPerfectSquare(16) === true)
  }

  test("14 is false") {
    assert(checker.isPerfectSquare(14) === false)
  }

  test("1 is true") {
    assert(checker.isPerfectSquare(1) === true)
  }

  test("-1 is false") {
    assert(checker.isPerfectSquare(-1) === false)
  }

  test("-16 is false") {
    assert(checker.isPerfectSquare(-16) === false)
  }

  test("0 is true") {
    assert(checker.isPerfectSquare(0) === true)
  }

}
