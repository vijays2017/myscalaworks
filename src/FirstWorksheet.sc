/**

First foremost important point in Scala is that everything is Object.
Also, r-value (Right hand side) is expression . If/Else expression, Match expression whcih can
evalute to assignable value. Scala has strong type inference using Any, ANyVal, Nothing etc,

*/


object FirstWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  34                                              //> res0: Int(34) = 34
    var (d, e ) = (4,5)                           //> d  : Int = 4
                                                  //| e  : Int = 5
    println (d.toInt, e.toInt);                   //> (4,5)
    
    def square (x:Double):Double = {
    	x*x // return is not necssary
    }                                             //> square: (x: Double)Double
 
    def add (x:Double) : Double = {
    	return x*x
    }                                             //> add: (x: Double)Double
    def ad (x:Double)=x*x // One liner functions can omit curly braces. return type and return.
                                                  //> ad: (x: Double)Double
    
 		square(25)                        //> res1: Double = 625.0
 		ad(25)                            //> res2: Double = 625.0
 		add(25)                           //> res3: Double = 625.0
 		
 		// for the functions that return Unit you are allowed to leave '=' sign and return type .
 		//Print statement returns Unit type. Unit is simiar to void
 		def sayHello (name:String)
 		{
 			print(s"Hello , $name")
 		}                                 //> sayHello: (name: String)Unit
 		
 		def printHello (name:String):Unit =
 		{
 			print(s"Hello , $name")
 		}                                 //> printHello: (name: String)Unit
 		
 		//greet is still returning Unit
 		def sayName(name:String)
 		{
 			print(s"Hello , $name")
 			4
 		}                                 //> sayName: (name: String)Unit
 		
 		//greet is returning Int only when specified Int return type otherwise it will take the form of print
 		def greet(name:String):Int =
 		{
 			print(s"Hello , $name")
 			4
 		}                                 //> greet: (name: String)Int
 		
 		
 		printHello ("Don")                //> Hello , Don
 		
 		 sayHello ("Don")                 //> Hello , Don
 				add(25)           //> res4: Double = 625.0
 				
 				
 		// Recursive function. Requires the return type.
 		
 		def factorial (n : Int) : Int= if (n < 2 ) 1 ; else n*factorial(n-1)
                                                  //> factorial: (n: Int)Int
 		factorial(3)                      //> res5: Int = 6
 		
 		
 		/*
 		In scala we can nest the constructs. We take an example of a unit circle and unit square.
 		1. genearte the numbers.
 		2. check if it's inside or outside teh circle.
 		3. it will be inside the circle if x2+y2 <1
 		4. The value of PI is aprox equals to ratio of number points(darts) inside the circle to
 		the total no of darts thrown. If there are 5 darts thrown then PI = 4/5*4 .
 					
 							|-------
 							|				|
 							|				|
 							|				|
 	-----------------------------
 							|
 							|
 							|
 							|
 		*/
 		
 		import scala.annotation._
 		def estimatePI (n:Int ) : Double =
 		{
 			@tailrec
 				def helper (count : Int, sum:Int ) : Double=
 				{
 					if (count < 1) sum
 					else   {
 						val x = Math.random()
 						val y = Math.random()
 						//(if (x*x + y*y) < 1 else 0 )+helper(count-1)
 						helper(count-1,((if (x*x+y*y <1) 1 else 0) + sum))
 					}
 				}
 				helper(n,0)/n*4
 		}                                 //> estimatePI: (n: Int)Double
 		estimatePI(10000)                 //> res6: Double = 3.112
 		
 		
 		
 val a = 5                                        //> a  : Int = 5
 		
 		 val res = a match {
    case 0 => "match1"
    
    case 1 => "match2"
      
    case _ => "Anything else "
      
  }                                               //> res  : String = "Anything else "
  
  val weekOfTheDay = "Sunday"                     //> weekOfTheDay  : String = Sunday
  
  val day = weekOfTheDay match{
  	case "Sunday" => "Sleepy Sunday"
  	
  	case "Monday" => "Manic Monday"
  }                                               //> day  : String = Sleepy Sunday
  
  val weekOfTheDy = "Tuesday"                     //> weekOfTheDy  : String = Tuesday
  
  val antherday = weekOfTheDy match{
  	case "Sunday"|"Saturday" => "Sleepy Sunday"
  	
  	case "Monday" => "Manic Monday"
  	
  		case "Tuesday" | "Wednesday" |"Thursday" | "Friday"  => "Any other day"
  }                                               //> antherday  : String = Any other day
  
  // match case with pattern downcasting
  
  
  val radius:Any = 10                             //> radius  : Any = 10
  
  
  val myRadius = radius match{
  
  	case radius : Integer => "Integer"
  	case radius : Double => "Double"
  	
  	case radius : String  => "String"
  	
  	case  _ => "Any"
  	}                                         //> myRadius  : String = Integer
  
   val rad:Any = "10.00" //now rad is Strnig reference variable.
                                                  //> rad  : Any = 10.00
  
  //Since rad is of type AnyRef (AnyRef is above String ref) so ANyRef
  // case will be matched . return value will be "String" of the type String
   
     val myRad = rad match{
  
  	case radius : Int => "Integer"
  	case radius : AnyRef => "String"
  	  	
  	case  _ => "Any"
  	}                                         //> myRad  : String = String
  	
  	
  	val radi:Any = 10.00                      //> radi  : Any = 10.0
  
  // catch-all/Match all will work as usual. Here radi will not match with any case and so it will fallback to
  // '_' and thus return will be "Any" (type String)
  val myRadii = radi match{
  	
  	case radius : Integer => "Integer"
  	case radius : String => "String"
  	case  _ => "Any"
  	}                                         //> myRadii  : String = Any
  	
  	// Tuples are the container objects whcih can contain different types
  	// of elements. To instantiate a Tuple just place the objects in parenthesis,
  	// separated by commas. Once you have a tuple instantiated, you can access its elements
	// individually with a dot, underscore, and the one-based index of the element.
	
	var tuple = (1 , "One")                   //> tuple  : (Int, String) = (1,One)
  	
  	tuple ._1                                 //> res7: Int = 1
  	
  	tuple ._2                                 //> res8: String = One
  	
}