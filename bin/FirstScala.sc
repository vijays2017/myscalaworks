
object FirstScala  {
  
  def main(args: Array[String]): Unit = {
  
    println("Hello world")
    5
  4
  
  var a = 5
  val b = 6
  
  "4.5".toDouble
  
  var x,y,z = 0;

  // var declaration for extra check
  var c:Int = 10
  
   x= if ( a<9) 3 else  2; //This is similar to ternary operator in java
  
  if ( a<9) println ("less") else ()
  //tupels
  var (d, e ) = (4,5)
  
  println (d.toInt, e.toInt);
  
  
  // Match exressions
  
  val res = a match {
    case 0 => "match1"
    
    case 1 => "match2"
      
    case _ => "Anything else "
      
  }
  
  }                                               //> main: (args: Array[String])Unit
  
}