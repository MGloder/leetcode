package com.machinedoll.wonderland

class MaximumDepthofBinaryTree {
  def maxDepth(root: TreeNode): Int = {
    def findMaxDepth(node: TreeNode): Int = {
      if (node == null) return 0
      Math.max(findMaxDepth(node.left), findMaxDepth(node.right)) + 1
    }

    findMaxDepth(root)
  }
}
