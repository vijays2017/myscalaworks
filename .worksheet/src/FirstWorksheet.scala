/**

First foremost important point in Scala is that everything is Object.
Also, r-value (Right hand side) is expression . If/Else expression, Match expression whcih can
evalute to assignable value. Scala has strong type inference using Any, ANyVal, Nothing etc,

*/


object FirstWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(336); 
  println("Welcome to the Scala worksheet");$skip(5); val res$0 = 
  34;System.out.println("""res0: Int(34) = """ + $show(res$0));$skip(24); 
    var (d, e ) = (4,5);System.out.println("""d  : Int = """ + $show(d ));System.out.println("""e  : Int = """ + $show(e ));$skip(32); 
    println (d.toInt, e.toInt);$skip(83); ;
    
    def square (x:Double):Double = {
    	x*x // return is not necssary
    };System.out.println("""square: (x: Double)Double""");$skip(60); 
 
    def add (x:Double) : Double = {
    	return x*x
    };System.out.println("""add: (x: Double)Double""");$skip(96); 
    def ad (x:Double)=x*x;System.out.println("""ad: (x: Double)Double""");$skip(19); val res$1 =  // One liner functions can omit curly braces. return type and return.
    
 		square(25);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 
 		ad(25);System.out.println("""res2: Double = """ + $show(res$2));$skip(11); val res$3 = 
 		add(25);System.out.println("""res3: Double = """ + $show(res$3));$skip(228); 
 		
 		// for the functions that return Unit you are allowed to leave '=' sign and return type .
 		//Print statement returns Unit type. Unit is simiar to void
 		def sayHello (name:String)
 		{
 			print(s"Hello , $name")
 		};System.out.println("""sayHello: (name: String)Unit""");$skip(81); 
 		
 		def printHello (name:String):Unit =
 		{
 			print(s"Hello , $name")
 		};System.out.println("""printHello: (name: String)Unit""");$skip(111); 
 		
 		//greet is still returning Unit
 		def sayName(name:String)
 		{
 			print(s"Hello , $name")
 			4
 		};System.out.println("""sayName: (name: String)Unit""");$skip(185); 
 		
 		//greet is returning Int only when specified Int return type otherwise it will take the form of print
 		def greet(name:String):Int =
 		{
 			print(s"Hello , $name")
 			4
 		};System.out.println("""greet: (name: String)Int""");$skip(30); 
 		
 		
 		printHello ("Don");$skip(25); 
 		
 		 sayHello ("Don");$skip(13); val res$4 = 
 				add(25);System.out.println("""res4: Double = """ + $show(res$4));$skip(140); 
 				
 				
 		// Recursive function. Requires the return type.
 		
 		def factorial (n : Int) : Int= if (n < 2 ) 1 ; else n*factorial(n-1);System.out.println("""factorial: (n: Int)Int""");$skip(16); val res$5 = 
 		factorial(3)
 		
 		
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
 		
 		import scala.annotation._;System.out.println("""res5: Int = """ + $show(res$5));$skip(947); 
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
 		};System.out.println("""estimatePI: (n: Int)Double""");$skip(21); val res$6 = 
 		estimatePI(10000);System.out.println("""res6: Double = """ + $show(res$6));$skip(23); 
 		
 		
 		
 val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(128); 
 		
 		 val res = a match {
    case 0 => "match1"
    
    case 1 => "match2"
      
    case _ => "Anything else "
      
  };System.out.println("""res  : String = """ + $show(res ));$skip(33); 
  
  val weekOfTheDay = "Sunday";System.out.println("""weekOfTheDay  : String = """ + $show(weekOfTheDay ));$skip(114); 
  
  val day = weekOfTheDay match{
  	case "Sunday" => "Sleepy Sunday"
  	
  	case "Monday" => "Manic Monday"
  };System.out.println("""day  : String = """ + $show(day ));$skip(33); 
  
  val weekOfTheDy = "Tuesday";System.out.println("""weekOfTheDy  : String = """ + $show(weekOfTheDy ));$skip(210); 
  
  val antherday = weekOfTheDy match{
  	case "Sunday"|"Saturday" => "Sleepy Sunday"
  	
  	case "Monday" => "Manic Monday"
  	
  		case "Tuesday" | "Wednesday" |"Thursday" | "Friday"  => "Any other day"
  };System.out.println("""antherday  : String = """ + $show(antherday ));$skip(72); 
  
  // match case with pattern downcasting
  
  
  val radius:Any = 10;System.out.println("""radius  : Any = """ + $show(radius ));$skip(184); 
  
  
  val myRadius = radius match{
  
  	case radius : Integer => "Integer"
  	case radius : Double => "Double"
  	
  	case radius : String  => "String"
  	
  	case  _ => "Any"
  	};System.out.println("""myRadius  : String = """ + $show(myRadius ));$skip(68); 
  
   val rad:Any = "10.00";System.out.println("""rad  : Any = """ + $show(rad ));$skip(288);  //now rad is Strnig reference variable.
  
  //Since rad is of type AnyRef (AnyRef is above String ref) so ANyRef
  // case will be matched . return value will be "String" of the type String
   
     val myRad = rad match{
  
  	case radius : Int => "Integer"
  	case radius : AnyRef => "String"
  	  	
  	case  _ => "Any"
  	};System.out.println("""myRad  : String = """ + $show(myRad ));$skip(32); 
  	
  	
  	val radi:Any = 10.00;System.out.println("""radi  : Any = """ + $show(radi ));$skip(298); 
  
  // catch-all/Match all will work as usual. Here radi will not match with any case and so it will fallback to
  // '_' and thus return will be "Any" (type String)
  val myRadii = radi match{
  	
  	case radius : Integer => "Integer"
  	case radius : String => "String"
  	case  _ => "Any"
  	};System.out.println("""myRadii  : String = """ + $show(myRadii ));$skip(357); 
  	
  	// Tuples are the container objects whcih can contain different types
  	// of elements. To instantiate a Tuple just place the objects in parenthesis,
  	// separated by commas. Once you have a tuple instantiated, you can access its elements
	// individually with a dot, underscore, and the one-based index of the element.
	
	var tuple = (1 , "One");System.out.println("""tuple  : (Int, String) = """ + $show(tuple ));$skip(17); val res$7 = 
  	
  	tuple ._1;System.out.println("""res7: Int = """ + $show(res$7));$skip(17); val res$8 = 
  	
  	tuple ._2;System.out.println("""res8: String = """ + $show(res$8))}
  	
}
