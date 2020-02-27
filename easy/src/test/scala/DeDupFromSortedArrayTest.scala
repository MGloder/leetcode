import com.machinedoll.wonderland.DeDupFromSortedArray
import org.scalatest.funsuite.AnyFunSuite

class DeDupFromSortedArrayTest extends AnyFunSuite {
  val checker = new DeDupFromSortedArray()
  test("[1, 2, 3] is 3") {
    assert(checker.removeDuplicates(Array(1,2 ,3)) === 3)
  }

  test("[] is 0") {
    assert(checker.removeDuplicates(Array()) === 0)
  }

  test("[1, 1, 2, 2, 3] is 3") {
    assert(checker.removeDuplicates(Array(1, 1, 2, 2, 3)) === 3)
  }

}
