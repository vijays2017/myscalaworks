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

object FunctionsAndMethods {
  println("Welcome to the Scala worksheet of Fnctions and Methods.")
                                                  //> Welcome to the Scala worksheet of Fnctions and Methods.
  
  // example function below..
  
  val getRectangleArea = (length:Double, breadth:Double) => {length * breadth}: Double
                                                  //> getRectangleArea  : (Double, Double) => Double = <function2>
    
   val area = getRectangleArea(5,8)               //> area  : Double = 40.0
   


// example method below..

val PI = 3.14                                     //> PI  : Double = 3.14

val r = 10                                        //> r  : Int = 10

def getcircleArea(r:Double):Double = PI * r * r   //> getcircleArea: (r: Double)Double

	getcircleArea(r)                          //> res0: Double = 314.0
	
	


//Named method parameters ..This is only applicable to METHODS and NOT Functions.


def getRectangleAreaMethod (length : Double, breadth : Double ) = {
	
		println (s"Length = $length , b = $breadth")
		
		length*breadth
	}                                         //> getRectangleAreaMethod: (length: Double, breadth: Double)Double

getRectangleAreaMethod(5, 10)                     //> Length = 5.0 , b = 10.0
                                                  //| res1: Double = 50.0

// see the parameters are reversed with  values
getRectangleAreaMethod(breadth=5, length=10)      //> Length = 10.0 , b = 5.0
                                                  //| res2: Double = 50.0
                                                  
   // Default parameters values . Any parameter can ave default value.
  
  
  def getRectangleAreaMethodDefault (length : Double, breadth : Double = 10 ) = {
	
		println (s"Length = $length , b = $breadth")
		
		length*breadth
	}                                         //> getRectangleAreaMethodDefault: (length: Double, breadth: Double)Double
	
	getRectangleAreaMethodDefault (10)        //> Length = 10.0 , b = 10.0
                                                  //| res3: Double = 100.0
	
		getRectangleAreaMethodDefault (10, 20)
                                                  //> Length = 10.0 , b = 20.0
                                                  //| res4: Double = 200.0
	
	
	// Type parameters or also called as Parametrics polymorphies or Generics in Java
	
	
	val someList  = 2 :: 1 :: "bar" :: "foo" :: Nil
                                                  //> someList  : List[Any] = List(2, 1, bar, foo)
	
	// val anotehrList : List [String] = 2 :: 1 :: "bar" :: "foo" :: Nil will give error
	
	val anotehrList : List [String] = "bar" :: "foo" :: Nil
                                                  //> anotehrList  : List[String] = List(bar, foo)
                                                  
    // Vararg parmeters only works with methods.
    // This is equivalent to multiple args and actual number is found at runtime.
    // Vararg parameters should always be at the end of the param list
    // Vararg params are converted to list
   
   
  def join (vals : String*) = {
  	
  	var newString =""
  	
  	for (v <- vals ) newString = v+ " " + newString
  	
  	newString
  
  }                                               //> join: (vals: String*)String
  
    join("a", "b", "c")                           //> res5: String = "c b a "
  
  val joinFn = join _ // method converted to functions.
                                                  //> joinFn  : Seq[String] => String = <function1>
  
  // joinFn("a", "b", "c") error
  
   joinFn(Seq("a", "b", "c"))                     //> res6: String = "c b a "
}