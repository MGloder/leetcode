package com.machinedoll.wonderland

object SymmetricTree {
  /**
    * Definition for a binary tree node.
    * class TreeNode(var _value: Int) {
    * var value: Int = _value
    * var left: TreeNode = null
    * var right: TreeNode = null
    * }
    */

  def isMirror(t1: TreeNode, t2: TreeNode): Boolean = {
    if (t1 == null && t2 == null) return true
    if (t1 == null || t2 == null) return false
    (t1.value == t2.value) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)
  }

  def isSymmetric(root: TreeNode): Boolean =
    isMirror(root, root)

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
