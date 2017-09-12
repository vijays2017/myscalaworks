/*
----------IMP NOTE ABOUT FUNCTIONS AND METHODS ---
There is a clear difference between Functions and methods in Sacala.

FUNCTIONS ---
1. Function are like objects this means they can be stored
in a variable
2. Functions in Scala are 'First Class Functions.'
3. Functions will always have a variable assigned and they act as r-values.
4. First Class Functions states that
		Methods can accept and return Functions (since Functions are objects and objects can be stored in a variable)
5. Support to 'First
6. Functios are slower and add extra over head.
7. Functions are not associated with class.
8. Very very important - Functions are named re-usable expressions.

Expression block in Scala is enclosed in curly bracket like this { // some code } and it can return a value
		
		{
			area = PI * r * r
		}  //this expression block returns area
		
9. Functions will have scope.

METHODS---
1. Methods start with the keyword def
2. Methods are bound to a classes.
3. Since Methods can take arguments and Functions can be stored in varioables
so Methods can take functions as arguments.
4. Methods are not objects.
*/

object FunctionsAndMethods {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1216); 
  println("Welcome to the Scala worksheet of Fnctions and Methods.");$skip(123); 
  
  // example function below..
  
  val getRectangleArea = (length:Double, breadth:Double) => {length * breadth}: Double;System.out.println("""getRectangleArea  : (Double, Double) => Double = """ + $show(getRectangleArea ));$skip(41); 
    
   val area = getRectangleArea(5,8);System.out.println("""area  : Double = """ + $show(area ));$skip(47); 
   


// example method below..

val PI = 3.14;System.out.println("""PI  : Double = """ + $show(PI ));$skip(12); 

val r = 10;System.out.println("""r  : Int = """ + $show(r ));$skip(49); 

def getcircleArea(r:Double):Double = PI * r * r;System.out.println("""getcircleArea: (r: Double)Double""");$skip(19); val res$0 = 

	getcircleArea(r);System.out.println("""res0: Double = """ + $show(res$0));$skip(231); 
	
	


//Named method parameters ..This is only applicable to METHODS and NOT Functions.


def getRectangleAreaMethod (length : Double, breadth : Double ) = {
	
		println (s"Length = $length , b = $breadth")
		
		length*breadth
	};System.out.println("""getRectangleAreaMethod: (length: Double, breadth: Double)Double""");$skip(31); val res$1 = 

getRectangleAreaMethod(5, 10);System.out.println("""res1: Double = """ + $show(res$1));$skip(94); val res$2 = 

// see the parameters are reversed with  values
getRectangleAreaMethod(breadth=5, length=10);System.out.println("""res2: Double = """ + $show(res$2));$skip(282); 
                                                  
   // Default parameters values . Any parameter can ave default value.
  
  
  def getRectangleAreaMethodDefault (length : Double, breadth : Double = 10 ) = {
	
		println (s"Length = $length , b = $breadth")
		
		length*breadth
	};System.out.println("""getRectangleAreaMethodDefault: (length: Double, breadth: Double)Double""");$skip(38); val res$3 = 
	
	getRectangleAreaMethodDefault (10);System.out.println("""res3: Double = """ + $show(res$3));$skip(43); val res$4 = 
	
		getRectangleAreaMethodDefault (10, 20);System.out.println("""res4: Double = """ + $show(res$4));$skip(140); 
	
	
	// Type parameters or also called as Parametrics polymorphies or Generics in Java
	
	
	val someList  = 2 :: 1 :: "bar" :: "foo" :: Nil;System.out.println("""someList  : List[Any] = """ + $show(someList ));$skip(147); 
	
	// val anotehrList : List [String] = 2 :: 1 :: "bar" :: "foo" :: Nil will give error
	
	val anotehrList : List [String] = "bar" :: "foo" :: Nil;System.out.println("""anotehrList  : List[String] = """ + $show(anotehrList ));$skip(440); 
                                                  
    // Vararg parmeters only works with methods.
    // This is equivalent to multiple args and actual number is found at runtime.
    // Vararg parameters should always be at the end of the param list
    // Vararg params are converted to list
   
   
  def join (vals : String*) = {
  	
  	var newString =""
  	
  	for (v <- vals ) newString = v+ " " + newString
  	
  	newString
  
  };System.out.println("""join: (vals: String*)String""");$skip(27); val res$5 = 
  
    join("a", "b", "c");System.out.println("""res5: String = """ + $show(res$5));$skip(59); 
  
  val joinFn = join _;System.out.println("""joinFn  : Seq[String] => String = """ + $show(joinFn ));$skip(69); val res$6 =  // method converted to functions.
  
  // joinFn("a", "b", "c") error
  
   joinFn(Seq("a", "b", "c"));System.out.println("""res6: String = """ + $show(res$6))}
}
