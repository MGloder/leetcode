package com.machinedoll.wonderland

object MinimumDepthofBinaryTree {
  def minDepth(root: TreeNode): Int = {
    def findMinDepth(node: TreeNode): Int = {
      if (node == null) {
        return 0
      }
      val left = findMinDepth(node.left)
      val right = findMinDepth(node.right)
      if (node.left != null && node.right != null) {
        return 1 + Math.min(left, right)
      } else {
        return 1 + Math.max(left, right)
      }
    }
    findMinDepth(root)
  }
}
