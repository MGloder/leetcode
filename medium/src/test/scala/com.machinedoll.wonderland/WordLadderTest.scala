package com.machinedoll.wonderland

import org.scalatest.funsuite.AnyFunSuite

class WordLadderTest extends AnyFunSuite {
  val checker = new WordLadder
  test("[hit], [cog], [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]") {
    assert(checker.ladderLength("hit", "cog", List("hot", "dot", "dog", "lot", "log", "cog")) == 5)
  }

  test("[hit], [cog], [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]") {
    assert(checker.ladderLength("hit", "cog", List("hot", "dot", "dog", "lot", "log")) == 0)
  }

  test("[a], [c], [a,b,c]") {
    assert(checker.ladderLength("a", "c", List("a", "b", "c")) == 2)
  }

  test("[leet], [code], [a,b,c]") {
    assert(checker.ladderLength("leet", "code", List("lest", "leet", "lose", "code", "lode", "robe", "lost")) == 6)
  }
  test("long string") {
    assert(checker.ladderLength("qa", "sq", List("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye")) == 6)
  }

}
