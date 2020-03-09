package com.machinedoll.wonderland

class DeleteDuplicates {
  def deleteDuplicates(head: ListNode): ListNode = {
    var pointer = head
    var result = head
    while (pointer != null) {
      if (pointer.next != null && pointer.next.x == pointer.x) {
        pointer.next = pointer.next.next
      } else {
        pointer = pointer.next
      }
    }
    result
  }
}
