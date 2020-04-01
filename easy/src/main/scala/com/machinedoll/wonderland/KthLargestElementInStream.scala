package com.machinedoll.wonderland

import scala.collection.mutable


class KthLargestElementInStream(_k: Int, _nums: Array[Int]) {

  private val minHeap = mutable.PriorityQueue[Int](_nums: _*)(Ordering.by(e => -e))

  def add(`val`: Int): Int = {
    minHeap.enqueue(`val`)
    while (minHeap.size > _k) minHeap.dequeue()

    minHeap.head
  }
}
