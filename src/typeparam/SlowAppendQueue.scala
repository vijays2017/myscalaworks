package typeparam

class SlowAppendQueue[T](elems: List[T]) { 
  // Not efficient 
  def head = elems.head 
  
  def tail = new SlowAppendQueue(elems.tail) 
  
  def append(x: T) = new SlowAppendQueue(elems ::: List(x)) 
  
}
