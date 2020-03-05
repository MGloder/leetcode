package com.machinedoll.wonderland

class ClimbStairs {
  /*
    You are climbing a stair case. It takes n steps to reach to the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
   */
  def climbStairs(n: Int): Int = {
    if (n < 2) return 1
    val array = new Array[Int](n + 1)
    array(0) = 1
    array(1) = 1
    for (index <- 2 to n) {
      array(index) = array(index - 1) + array(index - 2)
    }
    array(n)
  }
}
