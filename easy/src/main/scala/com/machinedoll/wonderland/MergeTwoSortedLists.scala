package com.machinedoll.wonderland

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

class MergeTwoSortedLists {
  /*
  Merge two sorted linked lists and return it as a new list.
  The new list should be made by splicing together the nodes of the first two lists.
   */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) {
      return l2
    } else if (l2 == null) {
      return l1
    }

    var resultList: ListNode = new ListNode()
    val resultHead: ListNode = resultList
    var l1Cursor: ListNode = l1
    var l2Cursor: ListNode = l2

    while (l1Cursor != null) {
      if (l2Cursor == null) {
        resultList.next = l1Cursor
        l1Cursor = null
      } else if (l1Cursor.x < l2Cursor.x) {
        resultList.next = new ListNode(l1Cursor.x)
        l1Cursor = l1Cursor.next
      } else {
        resultList.next = new ListNode(l2Cursor.x)
        l2Cursor = l2Cursor.next
      }
      resultList = resultList.next
    }

    if (l2Cursor != null) {
      resultList.next = l2Cursor
    }


    return resultHead.next
  }
}
