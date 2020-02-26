import org.scalatest.funsuite.AnyFunSuite
import com.machinedoll.wonderland.ValidParentheses


class ValidParenthesesTest extends AnyFunSuite {
  val validator = new ValidParentheses()
  test("{{{}}} is true") {
    assert(validator.isValid("{{{}}}") === true)
  }

  test("{{{}} is false") {
    assert(validator.isValid("{{{}}") === false)
  }

  test("{{[()()[]]}} is true") {
    assert(validator.isValid("{{[()()[]]}}") === true)
  }

  test("()[]{} is true") {
    assert(validator.isValid("()[]{}") === true)
  }

  test("([)] is false") {
    assert(validator.isValid("([)]") === false)
  }

  test("\"\" is true") {
    assert(validator.isValid("") === true)
  }

  test("] is false") {
    assert(validator.isValid("]") === false)
  }

  test("  \"([]\" is false") {
    assert(validator.isValid("([]") === false)
  }

}
