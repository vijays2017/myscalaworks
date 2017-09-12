package ninetynineproblems

object ListProblems2 extends App {
  
  def duplicateElements [T] (xs : List [T]) : List[T] =  xs flatMap { x => List.fill(2)(x) }
     

  println (duplicateElements(List('a, 'b, 'c, 'c, 'd)))

  def duplicateElementsNTimes [T] (n : Int , xs : List [T]) : List[T] =  xs flatMap {  List.fill(n)(_) }
    
  
  println (duplicateElementsNTimes(3, List('a, 'b, 'c, 'c, 'd)))
  
  val dropNth =  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  
  var cnt = 0
  
  def dropNthELement  [T] (n : Int , xs : List [T]) : List[T] = {
    
  val partitioned = xs.zipWithIndex partition(e => (e._2 + 1) % n != 0 )
   
   
   partitioned._1  map { _._1} // e => e._1 
   
  }
  
  def splitNth  [T] (n : Int , xs : List [T]) : (List [T], List [T]) = {
      
    val partitioned =  xs.zipWithIndex partition (e => (e._2 + 1) <= n ) 
    
    (partitioned._1.map(_._1), partitioned._2 map ( _._1) )
    
  }
  
  def splitFunctional[A](n: Int, ls: List[A]): (List[A], List[A]) = (ls.take(n), ls.drop(n))
    
 println (dropNthELement (3, dropNth))
 println (dropNthELement (2, dropNth))
 
 println ( splitNth(3, dropNth))
 
 def splitRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    
    case (_, Nil)       => (Nil, Nil)
    case (0, list)      => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitRecursive(n - 1, tail)
      (h :: pre, post)
    }
  }
 
  def sliceBuiltIn [T] ( start : Int, end : Int, list : List [T]) : List [T] = list.slice(start, end)  
  
  def sliceRecursive [T] ( start : Int, end : Int, list : List [T]) : List [T] = {
    
    def sliceRecursive [T] ( start : Int, end : Int, list : List [T], cnt : Int, ys: List [T]) : List [T] = (start, end, list) match{
      
      case (_,  _ , Nil) => Nil
      
        case (_,  _, list) if (end == cnt) => ys reverse
       
        case (s, end , x:: xs ) => //println (start + "end " + end + " cnt " + cnt) 
        
                                if (cnt == s && cnt < end)
                                {
                                    //  println (x::ys)
                                      sliceRecursive(s+1, end, xs, cnt+1 , x::ys)
                                }
                                  else sliceRecursive(s, end, xs, cnt+1, ys); 
    }
    
    sliceRecursive(start, end, list, 0, Nil)
    
    
  }
  
  println (sliceRecursive(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  
  /*def rotateNLeftBuiltIn [T] (n : Int, xs : List [T] ) = {
    
    xs.d
    
  }*/
  
  
  def rotateNLeft [T] (n : Int, xs : List [T] ) : List [T] = {
  
      def rotateNLeft [T] (n : Int, xs : List [T] , ys : List [T], index : Int) : List [T] = {
        
        xs match {
          
          case Nil => ys.reverse 
            
          case x :: xs => if (index >=n) 
                            {
                          //    println (ys)
                              rotateNLeft [T] (n , xs ,x :: ys, index+1)
                            }
          
                            else rotateNLeft [T] (n , xs , ys, index+1)
        }
        
      }
      
      rotateNLeft(n , xs , Nil, 0) ::: xs.take(n)
  }
  
  println (rotateNLeft(3, List('a, 'b, 'c, 'd, 'e, 'f,'g, 'h, 'i, 'j, 'k)))
  
  /*val x ='x
  print(x.getClass )
*/
  def removeAt [T] (n : Int, xs: List[T]) : ( List[T] , T) = {
   
     val xsWithIndex = xs.zipWithIndex 
     
   //  println (xsWithIndex)
    val xsWithIndexDivided = xsWithIndex partition( e => (e._2 == n) )
     
   //  println (xsWithIndexDivided)
     
     (xsWithIndexDivided._2.map(_._1), xsWithIndexDivided._1.map(_._1).apply(0) )
  }
  
 println("Old .."+removeAt(1, List('a, 'b, 'c, 'd)))
 
  def removeAt2[A](n: Int, ls: List[A]): (List[A], A) =
    if (n < 0) throw new NoSuchElementException
    else (n, ls) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, h :: tail) => (tail, h)
      case (_, h :: tail) => {
        val (t, e) = removeAt2(n - 1, ls.tail)
          (h :: t, e)  //  (ls.head :: t, e)
      }
    }
 
  println("New.."+removeAt2(2, List('a, 'b, 'c, 'd)))
 
  
  def insertAt [T] ( s : T, n : Int , xs : List [T]) : List [T] =
  {
    
    if (xs == Nil) xs 
    else if ( n ==0 ) { 
              s :: xs
    }
    else {
        
        xs.head :: insertAt (s, n-1, xs.tail)
    }
  }
  
  println (insertAt('new, 1, List('a, 'b, 'c, 'd)))
  
  def insertAtBuiltIn [T] ( s : T, n : Int , xs : List [T]) : List [T] = xs.take(n) ::: s :: xs.takeRight(xs.size - n)
  
  
   println (insertAtBuiltIn('new, 2, List('a, 'b, 'c, 'd)))
   
   
   def listInRange (start : Int, end : Int ) : List [Int] = List.range(start, end+1) 
   
   
   println (listInRange(5, 9))
 }