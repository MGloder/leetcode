package com.machinedoll.wonderland

class InterleavingString {
  /*
  Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
   */
  def isInterleave(s1: String, s1Index: Int, s2: String, s2Index: Int, s3: String): Boolean = {
    if (s3.length == 0 && s1Index == s1.length && s2Index == s2.length) {
      return true
    }
    if (s3.length == 0) {
      return false
    }
    if (s1Index < s1.length && s1(s1Index) == s3(0)) {
      if (isInterleave(s1, s1Index + 1, s2, s2Index, s3.substring(1))) {
        return true
      }
    }
    if (s2Index < s2.length && s2(s2Index) == s3(0)) {
      if (isInterleave(s1, s1Index, s2, s2Index + 1, s3.substring(1))) {
        return true
      }
    }
    false
  }

  def isInterleave(s1: String, s2: String, s3: String): Boolean = {
    // BF
    isInterleave(s1, 0, s2, 0, s3)
  }

  def isInterleaveDP(s1: String, s2: String, s3: String): Boolean = {
    // DP
    if (s3.length != s1.length + s2.length) return false
    val dp: Array[Array[Boolean]] = Array.ofDim[Boolean](s1.length + 1, s2.length + 1)
    for (i <- (0 to s1.length)) {
      for (j <- (0 to s2.length)) {
        if (i == 0 && j == 0) {
          dp(i)(j) = true
        } else if (i == 0) {
          dp(i)(j) = dp(i)(j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1)
        } else if (j == 0) {
          dp(i)(j) = dp(i - 1)(j) && s1.charAt(i - 1) == s3.charAt(i + j - 1)
        } else {
          dp(i)(j) = (dp(i - 1)(j) && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp(i)(j - 1) && s2.charAt(j - 1) == s3.charAt(i + j - 1))
        }
      }
    }
    return dp(s1.length)(s2.length)
  }
}
