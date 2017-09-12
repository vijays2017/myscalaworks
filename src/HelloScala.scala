

object HelloScala extends App{
  
  val ele : Element = new ArrayElement (Array("hello", "World"))

  println(ele.width , ele.height)
  
  val r1 = new Rational (2,3)
  
  val r2 = new Rational (2,3)
  
  val r3 = 2
  
  println (r1)
  
  println ("Adding ", r1+r2)
  
  println ("Multiplying ", r1*r2)
  
   println ("Multiplying with 2 ", r1*2)
   
   /**
    * Advantages of case classes : 
    * 
    * First, it adds a factory method with the name of the class. 
    * This means youcan writesay, Var("x") to 
    * construct a Var object instead of the slightly longer new Var("x"):
    * 
    * */
   val v = Var ("x")
   
   val op = BinOp("+", Number (1), v)
   
   println (v.name)
   
   println (op.left)
   
   println (op)
   
   println (op.right == Var ("x"))
 
   
   def simplifyTop (expr : Expr ) : Expr = expr match {
    
    case   UnOp ("-" , UnOp ("-", e)) => e // double negation 
    
    case BinOp ("+", e , Number (0)) => e // Adding zero 
    
    case BinOp ("*", e , Number (1)) => e // Multiplying 1
    
    case _ => expr 
  }
  
  
   val expr =  simplifyTop (UnOp ("-" , UnOp ("-", Var ("x")))) 
 
   println(expr)
   
    def simplifyTopWildCard (expr : Expr )  = expr match {
     
        case BinOp( _, _, _) => println ("It's binary opeartion")
        case _ => println ("It's somethig else ")
     }
 
   // Constant pattern 
   
   def describe (x : Any) = x match 
   {
     case 5 => "Five" 
     
     case true => "True"
     case "hello" => "Hi !"
     
     case Nil => "The empty list"
       
     case _ => "Somethng else " 
   }
   
   println (describe (5))
   
      println (describe (true))
   
    println (describe ("hello"))
    
    println (describe (Nil))
    
    println (List (1,2,3))
    
    
  }