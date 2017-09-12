package collections.lists
/**
 * Concatenation(:::) is implemented as a method in class List.
 *  It would also be possible to implement concatenation “by hand,” 
 *  using pattern matching on lists. 
 */

object ListConcat extends App {
  
  def append [T] (xs : List [T] , ys : List [T] ) : List [T] = xs match {
    
    case List () => ys 
      
    case x :: xs1 =>   x :: append (xs1 , ys)
    
  }
  
}