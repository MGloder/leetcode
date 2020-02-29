import com.machinedoll.wonderland.SearchInsertPosition
import org.scalatest.funsuite.AnyFunSuite

class SearchInsertPositionTest extends AnyFunSuite {
  val checker = new SearchInsertPosition()
  test("[1,3,5,6], 5 == 2") {
    assert(checker.searchInsert(Array(1, 3, 5, 6), 5) === 2)
  }

  test("[], 1 == 0") {
    assert(checker.searchInsert(Array(), 3) === 0)
  }

  test("[1,2,3], 4 == 3") {
    assert(checker.searchInsert(Array(1, 2, 3), 4) === 3)
  }

  test("[1, 3], 2 === 1") {
    assert(checker.searchInsert(Array(1, 3), 2) === 1)
  }
}
