package ninetynineproblems

object ListProblems extends App {
  
  val list = List (1,2,3,4)
  
  def lastElement (xs : List[Int]) : Int = {
    xs match {
      
      case x :: Nil => x
      
      case x :: xs => lastElement(xs) 
      
      case List () => -1
    }
    
  }
  
  
  def builtInLast [T] (xs : List [T]) :T = xs.last
  
  
  println ("Last element is " + lastElement(list))
  
 //   println ("2nd element is " + list (0))
    
  def lastButOneElement (xs : List[Int]) : Int = {
    xs match {
      
      case x :: y :: Nil => x
      
      case x :: xs => lastButOneElement(xs) 
      
      case List () => -1
    }
    
  }
  
  def penultimateELement (xs  :List [Int]) : Int = xs.init.last 
  
  def returnNthBuiltIn[T]( n : Int , xs : List [T]) : Int = list.takeRight(n).head 
  
  def returnNthBuiltInNew[T]( n : Int , xs : List [T]) : Int = list (n)
    
  var count = 0
  
  def returnNthElement ( n : Int , xs : List [Int]) : Int = {
    
  xs match { 
    case x :: xs => if (count == n ) x 
                  else { count = count.+(1) ;
                  returnNthElement(n, xs)} 
    
    case Nil => -1
  }
    
  }
  println ("Last but one element is " + lastButOneElement(list))
  
  println ("Return nth element " + returnNthElement (1, list))
  
  def reverse [T] ( xs : List [T]) : List [T] = 
  {
    def reverse [T] (xs : List [T], ys : List [T]) : List [T] = {
      
      xs match {
        
        case Nil => ys
        
        case x :: xs => /*val combined = x :: ys
                      println (x)
                      println(combined)*/
                       println(ys) 
                      reverse (xs, x :: ys) 
        
    }
    
   }
      return reverse(xs, List ()); 
      
  }
  
  def isPalindrome [T] (xs : List [T]) : Boolean = {
    
    return xs == reverse(xs)
  }
  
  def reverseBuiltIn [T] (xs : List [T]) : List [T]  = xs.reverse  
  
    println ( "Reversed list is " + reverse(list))
  
   println ( "built in Reversed list is " + reverseBuiltIn(list))
   
    println ( "Is palindrome " + isPalindrome( "madam".toList) )
    
   def flatten [T] (xs : List [T]) : List [T]  = {
      
      xs match {
        
        case Nil => xs 
        
        case (x : List [T]) :: xs => flatten (x) ::: flatten (xs)
          
        case x :: xs => x :: flatten (xs)
        
      }
      
    }
    
  println ("flattened" +flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  
  def noDuplicates [T] (list : List [T]) : List [T] = {
    
    list match {
      
      case Nil => list
      
      case x :: xs => if ( !xs.contains(x)) x :: noDuplicates(xs) else noDuplicates(xs)
      
    }
    
  }
  
   def noDuplicatesStandard [T] (list : List [T]) : List [T] = {
    
    list match {
      
      case Nil => list
      
      case x :: xs => x :: noDuplicatesStandard(xs.dropWhile( _ == x))
      
    }
    
  }
  println ("no Duplicates " + noDuplicates(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)));
  
  println ("no Duplicates standard" + noDuplicatesStandard(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)));
  
  
    def packDuplicatesStandard [T] (list : List [T]) : List[List [T]] = {
         
      def packDuplicatesStandard [T] (ys : List [List[T]], list : List [T]) : List[List [T]] = {
          list match {
          
          case Nil => ys
          
          case x :: xs => //println (ys)
                    //  println (x, xs)
                  //   println ((ys, x::xs.takeWhile(_==x )))
                        packDuplicatesStandard( ys ::: List (x :: (xs.takeWhile(_==x )) ) , xs.dropWhile(_ == x))
          
        }
      }
      
      packDuplicatesStandard ( Nil, list)
    }
    
     println ("packDuplicatesStandard " + packDuplicatesStandard(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)));
     
      def encodeList [T] (list : List [T]) : List[Any] = {
        
         def encodeList [T] (list : List [T], ys : List [Any]) : List[Any] = {
         
           list match {
           
           case Nil => ys 
           
           case x :: xs => encodeList (xs.dropWhile(_ == x) , (xs.takeWhile(_==x ).length +1 ,x ) :: ys)  
         
         }
        
        
      }
       encodeList (list , Nil)
      }
      
       def encodeListNew [T] (list : List [T]) : List[ (Int, T)] = {
       
         packDuplicatesStandard(list) map( e => ( e.length , e.head) )
         
       }
       
       def encodeListNewModifid [T] (list : List [T]) : List[ Any] = {
       
         encodeListNew(list) map( e => if (e._1 > 1 ) e else e._1)
         
       }
       
      println ("encoded List New" + encodeListNew(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)));
      
        println ("encoded List New Modified" + encodeListNewModifid(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)));
        
        
   def decodeList [T] (list : List [ (Int, T)]) : List[T] = {
       
     list flatMap ( e => List.fill(e._1)(e._2)) 
       
   }
    
   println (decodeList (List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}