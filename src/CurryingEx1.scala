import java.io.PrintWriter
import java.util.Date


object CurryingEx1 extends App {
  
  def plainOldSum ( x : Int, y: Int) = x+ y
  
  
  println (plainOldSum(3, 4))
  
  def curriedSum (x:Int) (y:Int) = x + y
  
  println (curriedSum(3)(4))
  
  val onePlus = curriedSum(1)_ // partially applied function '_' is placeholder for second param.
 
  println( onePlus (2))
  
  
  val twoPlus= curriedSum(2)_
  
  println(twoPlus(2))
  
  // Making new control structures. Below example repeats an operation two times an returns the reslt.
  
  def twice (op : Double => Double , x: Double) = op (op (x)) // taking function as an argument , calls op() two times.
  
 val res =  twice (_ + 1 ,5 ); // def of the function is passed here 
  
  println( res)
  
  // common code abstracted . Second arg is function .
  def withPrintWriter (file : java.io.File , op : PrintWriter => Unit) = {
    
    val writer = new PrintWriter (file) ; 
    try { 
      
      op (writer)
      
    } finally {
      
      writer.close()
    }
    
  }
   withPrintWriter( new java.io.File ("C:/scalaworks/FirstScala/src/date.txt") , writer => writer.println (new Date ()))
   
   
   // if you are passing only 1 parameter exactly than you can use curly brackets
   
   println {" hello , I am using curly brakctes here !" }
   
   val g = " hello , I am using curly brakctes here !" 
   
   println( g.substring {7})
   
   //g.substring {7, 9 } this will  not compile 
   
    def withPrintWriterNew (file : java.io.File) (op : PrintWriter => Unit) = {
    
      val writer = new PrintWriter (file) ; 
      try { 
        
        op (writer)
        
      } finally {
        
        writer.close()
      }
   }
    
   withPrintWriterNew( new java.io.File ("C:/scalaworks/FirstScala/src/date2.txt")) {
       writer => writer.println (new Date ())
    
     }
}