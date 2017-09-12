/*package sorting

object TestSortings extends App{
  
  
  def bubbleSort  (xs : List [Int] ) : List [Int] = {
    
       
    
     xs match {
       
       case Nil => xs 
       
       case x :: xs1 => bubbleSort(bubbleSrt (x , xs1))
     }
   
  } 
  
   def bubbleSrt  (first : Int , ys : List [Int] ) : List [Int] = 
        {
          if (first > ys.head) 
          {
            (ys.head :: first :: Nil ) ::: ys.tail 
          }
          else 
          {
            (first ::  ys.head :: Nil ) ::: ys.tail
          }
        }
   
  println (bubbleSort(List (4,3,2,1)))
}*/