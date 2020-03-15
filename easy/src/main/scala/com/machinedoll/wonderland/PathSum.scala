package com.machinedoll.wonderland

object PathSum {
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    def checkPathSum(node: TreeNode, current: Int): Boolean = {
      if (node == null)
        return false
      if (node.left == null && node.right == null && current + node.value == sum)
        return true
      return checkPathSum(node.left, current + node.value) || checkPathSum(node.right, current + node.value)
    }

    return checkPathSum(root, 0)

  }
