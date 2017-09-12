package collections

object Arrays extends App {
  
  val ar : Array [Int] = Array (1,2,3,4)
  
  println (ar.head)
  
  println (ar(2))
  
  println (ar.init)
  println (ar.max)
  
  
  def repeatedParamsMethods ( x: Int, str : String, a : Any*) = {
    
    println (a); // Wrapped Array
    
    "%s %ss give you %s".format (x, str, a.mkString(", ") )
    
  }
  
  println (repeatedParamsMethods(3, "egg" , "delecious sandwich", "protien", "high cholestrol"))
  
  println (repeatedParamsMethods(3, "egg" , List("delecious sandwich", "protien", "high cholestrol")))

  println (repeatedParamsMethods(3, "egg" , List("delecious sandwich", "protien", "high cholestrol"):_*))

  val r = 1 to 10 
  
  println (r) 
  
    val r2 = 1 to 10  by 3 
  
  println (r2) 
  
    val r3 = 1 until 10 
  
  println (r3) 
  
  val r4 = ('a' to 'z') ++ ( 'A' to 'Z')
  
  println (r4)
  
  println (Range (1, 10))
  
  println (Range.inclusive(1, 10))
  
  
}