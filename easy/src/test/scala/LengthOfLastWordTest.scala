import com.machinedoll.wonderland.LengthOfLastWord
import org.scalatest.funsuite.AnyFunSuite

class LengthOfLastWordTest extends AnyFunSuite {
  val checker = new LengthOfLastWord()

  test("Hello World is 5") {
    assert(checker.lengthOfLastWord("Hello World") === 5)
  }

  test(" is 0") {
    assert(checker.lengthOfLastWord("") === 0)
  }

  test("\"\" is 0") {
    assert(checker.lengthOfLastWord(" ") === 0)
  }

}
