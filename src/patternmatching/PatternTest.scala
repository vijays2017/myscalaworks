package patternmatching

object PatternTest extends App {
  
  import Math.{E, PI}
  
  E match {
    case PI => println ("Strange Math? Pi =" + PI)
    case _ => println ("OK")
  }
  
  val pi = Math.PI
  
  E match {
    
    case pi => println ("Strange Math? Pi =" + pi) // variable pattern 
    
    case _ => println ("OK") // Warning -> Unreachble code.
  }
  
  // Using the back ticks , `pi` will be treated as constant and not a variable.   
  E match {
    
    case `pi` => println ("Strange Math? Pi =" + pi) // variable pattern 
    
    case _ => println ("OK") // Warning -> Unreachble code.
  }
  
  //This will have same effect as of back ticks.
   E match {
    
    case this.pi => println ("Strange Math? Pi =" + pi) // variable pattern 
    
    case _ => println ("OK") // Warning -> Unreachble code.
  }
   
   // Sequence pattern.
   
  def sequenceMatch ( expr : Any ) = expr match {
    
    case List (_,_,_) => println ("found it") 
    
      case List (0,_*) => println ("Starts with zero and regardless of length") 
      
      case (a,b,c) => println ("matched " + a +b +c)
      
    case _ => 
    
  }
  
  sequenceMatch (List (1,2,3))
  
  sequenceMatch (List (0,1,2,4))
  
  sequenceMatch (("a " ,3 , "-tuple"))
  
  
  //Typed patterns.
   def generalSize ( expr : Any ) = expr match {
    
    case s : String => println ("String size " + s.length) 
    
      case m: Map [_, _]=> println ("Map size is " + m.size) 
   
    case _ => println ("size is -1")
    
  }
  
  generalSize("abc")
  
  generalSize(Map (1->"abc", 2->"def"))
  
  generalSize(Math.PI)
  
  // Type erasure 
  
  def isIntIntMap (x : Any  ) = x match {
    
    case m : Map [Int, Int] => println (true) // compiler has no way to determine at runtime 
                                              //if the map is created with 2 Int arguements ,rather than with 
                                              // arguements of different types.  
    case _ => println (false)
  }
  
  isIntIntMap (Map (1->1, 2->2))
  
  isIntIntMap (Map (1->"1", 2->"2"))
  
  
  // Arrays are exception in type erasure
  
  def isStringArray (x : Any) = x match {
    
    case a: Array [String] => println ("String array")
    
    case _ => println ("Not a String array")
  }
  
  isStringArray (Array ("abc")) 
  
  isStringArray (Array (1,2,3))
  
}