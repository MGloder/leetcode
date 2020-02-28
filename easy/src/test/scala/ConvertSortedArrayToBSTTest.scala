import com.machinedoll.wonderland.ConvertSortedArrayToBST
import org.scalatest.funsuite.AnyFunSuite

class ConvertSortedArrayToBSTTest extends AnyFunSuite{
  val checker = new ConvertSortedArrayToBST()
  test("[1, 2, 3]") {
    val treeNode = checker.sortedArrayToBST(Array(1, 2, 3))
    assert(treeNode.value === 2)
    assert(treeNode.left.value === 1)
    assert(treeNode.right.value === 3)
  }

  test("[1, 2]") {
    val treeRoot = checker.sortedArrayToBST(Array(1, 2))
    assert(treeRoot.value === 2)
    assert(treeRoot.left.value === 1)
    assert(treeRoot.right === null)
  }

  test("[-10,-3,0,5,9, 10, 11, 12, 13, 14, 15]") {
    val treeRoot = checker.sortedArrayToBST(Array(-10,-3,0,5,9, 10, 11, 12, 13, 14, 15))
    //[10,0,13,-3,9,12,15,-10,null,5,null,11,null,14]
    assert(treeRoot.value === 10)
    assert(treeRoot.left.value === 0)
    assert(treeRoot.right.value === 13)
    assert(treeRoot.left.left.value === -3)
    assert(treeRoot.left.right.value === 9)
  }

  test("[]") {
    val treeRoot = checker.sortedArrayToBST(Array())
    assert(treeRoot === null)
  }
}
