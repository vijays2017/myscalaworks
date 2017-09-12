package typeparam

class ImmutableQueue [T] (private val leading: List[T], 
        private val trailing: List[T] )
{
  
  private def mirror = if (leading.isEmpty) new ImmutableQueue(trailing.reverse, Nil) else this
  
  def head = mirror.leading.head 
  
  def tail = {
              val q = mirror 
              new ImmutableQueue(q.leading.tail, q.trailing) 
          } 
  
  def append(x: T) = new ImmutableQueue(leading, x :: trailing)

}
  
  //Companion Object for Queue class 
  
  object ImmutableQueue {
    // constructs a queue with initial elements ‘xs’ 
    def apply [T] (xs: T*) = {
      
      new ImmutableQueue (xs.toList , Nil)
    }
  }