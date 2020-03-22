package com.machinedoll.wonderland

/**
  * Definition for a binary tree node.
  * class TreeNode(var _value: Int) {
  * var value: Int = _value
  * var left: TreeNode = null
  * var right: TreeNode = null
  * }
  */

class PathSumIII {
  def pathSum(root: TreeNode, sum: Int): Int = {
    var totalPath = 0
    def pathSum2(root2: TreeNode, sum: Int): Int = {
      def checkPath(node: TreeNode, passSum: Int): Unit = {
        if (node == null) {
          return
        }
        if (passSum + node.value == sum) {
          totalPath += 1
        }
        checkPath(node.left, passSum + node.value)
        checkPath(node.right, passSum + node.value)
      }
      if (root2 != null) {
        checkPath(root2, 0)
        pathSum2(root2.left, sum)
        pathSum2(root2.right, sum)
      }
      totalPath
    }
    return pathSum2(root, sum)
  }
}
