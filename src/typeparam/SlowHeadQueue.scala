package typeparam

class SlowHeadQueue[T](elems: List[T]) { 
  // Not efficient 
  def head = elems.head 
  
  def tail = new SlowHeadQueue(elems.tail) 
  
  def append(x: T) = new SlowHeadQueue(elems ::: List(x)) 
  
}
