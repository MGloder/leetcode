package com.machinedoll.wonderland

/**
  * Definition for a binary tree node.
  * class TreeNode(var _value: Int) {
  * var value: Int = _value
  * var left: TreeNode = null
  * var right: TreeNode = null
  * }
  */
class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}

class ConvertSortedArrayToBST {
  /** *
    * divide and conquer
    * */
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    val med = nums.length / 2
    val leftArray = nums.slice(0, med)
    val rightArray = nums.slice(med + 1, nums.length)

    def reverseFun(left: Array[Int], medium: TreeNode, right: Array[Int]): Unit = {
      if (left.length > 2) {
        val med = left.length / 2
        val leftArray = left.slice(0, med)
        val rightArray = left.slice(med + 1, nums.length)
        medium.left = new TreeNode(left(med))
        reverseFun(leftArray, medium.left, rightArray)
      } else {
        if (left.length == 2) {
          medium.left = new TreeNode(left(1))
          medium.left.left = new TreeNode(left(0))
        } else if (left.length == 1) {
          medium.left = new TreeNode(left(0))
        }
      }

      if (right.length > 2) {
        val med = right.length / 2
        val leftArray = right.slice(0, med)
        val rightArray = right.slice(med + 1, nums.length)
        medium.right = new TreeNode(right(med))
        reverseFun(leftArray, medium.right, rightArray)
      } else {
        if (right.length == 2) {
          medium.right = new TreeNode(right(1))
          medium.right.left = new TreeNode(right(0))
        } else if (right.length == 1) {
          medium.right = new TreeNode(right(0))
        }
      }
    }
    if (nums.length > 0) {
      val resultTreeNode = new TreeNode(nums(med))
      reverseFun(leftArray, resultTreeNode, rightArray)
      resultTreeNode
    } else {
      null
    }
  }

}
