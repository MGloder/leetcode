import com.machinedoll.wonderland.FindUniqueNumberFromLetter
import org.scalatest.funsuite.AnyFunSuite

class FindUniqeNumberFromLetterTest extends AnyFunSuite {
  val checker = new FindUniqueNumberFromLetter()
  test("1,2,3,4,5,6 is 3") {
    assert(checker.solution("123456") === 3)
  }

  test("1,1,1,1 is 5") {
    assert(checker.solution("1111") === 5)
  }
}
