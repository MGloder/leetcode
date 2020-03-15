package com.machinedoll.wonderland

object PathSum {
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    def checkPathSum(node: TreeNode, current: Int): Boolean = {
      if (node == null) {
        false
      } else {
        if (node.left == null && node.right == null) {
          if (current + node.value == sum)
            return true
          false
        } else {
          var leftResult = false
          var rightResult = false
          if (node.left != null) {
            leftResult = checkPathSum(node.left, current + node.value)
          }
          if (node.right != null) {
            rightResult = checkPathSum(node.right, current + node.value)
          }
          if (leftResult || rightResult)
            return true
          false
        }
      }
    }
    return checkPathSum(root, 0)
  }
}
