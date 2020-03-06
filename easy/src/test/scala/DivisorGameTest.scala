import com.machinedoll.wonderland.DivisorGame
import org.scalatest.funsuite.AnyFunSuite

class DivisorGameTest extends AnyFunSuite {
  val checker = new DivisorGame()
  test("2 is True") {
    assert(checker.divisorGame(2) === true)
  }

  test ("3 is false") {
    assert(checker.divisorGame(3) === false)
  }

  test("4 is true") {
    assert(checker.divisorGame(4) === true)
  }

  test("999 is false") {
    assert(checker.divisorGame(999) === false)
  }

  test("100 is true") {
    assert(checker.divisorGame(100) === true)
  }

}
