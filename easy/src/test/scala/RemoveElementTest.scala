import com.machinedoll.wonderland.RemoveElement
import org.scalatest.funsuite.AnyFunSuite

class RemoveElementTest extends AnyFunSuite {
  val checker = new RemoveElement()

  test("[2,2,3,3] and 2 == 2") {
    val input = Array(2, 2, 3, 3)
    val length = 2
    assert(checker.removeElement(input, 2) === length)
    println(input.toList)
  }

  test("[] and 0 == 0") {
    val input = Array[Int]()
    val length = 0
    assert(checker.removeElement(input, 0) === length)
    println(input.toList)
  }

  test("[1, 2, 3, 4] and 0 == 4") {
    val input = Array[Int](1, 2, 3, 4)
    val length = 4
    assert(checker.removeElement(input, 0) === length)
    println(input.toList)
  }


}
