package com.machinedoll.wonderland

class DesignHashTable {
  /** Initialize your data structure here. */
  val total = 1000000
  var hashArray: Array[Option[Int]] = new Array[Option[Int]](total)

  def add(key: Int) {
    val index = key % total
    hashArray(index) = Some(key)
  }

  def remove(key: Int) {
    val index = key % total
    hashArray(index) = null
  }

  /** Returns true if this set contains the specified element */
  def contains(key: Int): Boolean = {
    val index = key % total
    return !(hashArray(key) == null)
  }

  /**
    * Your MyHashSet object will be instantiated and called as such:
    * var obj = new MyHashSet()
    * obj.add(key)
    * obj.remove(key)
    * var param_3 = obj.contains(key)
    */
}
