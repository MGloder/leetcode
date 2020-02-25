import com.machinedoll.wonderland.LongestCommonPrefix
import org.scalatest.funsuite.AnyFunSuite

class LongestCommonPrefixTest extends AnyFunSuite {
  val check = new LongestCommonPrefix()
  test("[a, a, a] is a") {
    assert(check.longestCommonPrefix(Array("a", "a", "a")) === "a")
  }

  test("[\"flower\",\"flow\",\"flight\"] is fl") {
    assert(check.longestCommonPrefix(Array("flower","flow","flight")) === "fl")
  }

  test("[x, xx, ax] is \"\"") {
    assert(check.longestCommonPrefix(Array("x", "xx", "ax")) === "")
  }

  test("[] is \"\"") {
    assert(check.longestCommonPrefix(Array()) === "")
  }

  test("[aa, a] is a") {
    assert(check.longestCommonPrefix(Array("aa", "a")) === "a")
  }
}
