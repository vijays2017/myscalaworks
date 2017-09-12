/*
-----------------NOTES ---------
Procedures are named Statements which do not return any value.
It is applicable to both Functions and Methods.
This means that Procedures do not have any return type or return type is Unit (equivalent to void in Java).

From the definition,  Procedures neither take any input nor they return any value.

In Scala due to type inference we can omit the return type however it is a good
practice to specify the return type (which is Unit) in Procedure. This will show
the intent of the programmer/code.
*/

object Procedures {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def thisProc : Unit = {println ("Hello Procedure")}
                                                  //> thisProc: => Unit
  
  thisProc                                        //> Hello Procedure
  
  def thisProcWithNoReturn = println ("Hello Procedure without return type. Not recommended")
                                                  //> thisProcWithNoReturn: => Unit
  thisProcWithNoReturn                            //> Hello Procedure without return type. Not recommended
  
  
  def compareStrings(s1:String,s2:String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
}                                                 //> compareStrings: (s1: String, s2: String)Int


def smartCompare(s1:String, s2:String, cmpFn:(String,String) => Int):Int = {
  cmpFn(s1,s2)
}                                                 //> smartCompare: (s1: String, s2: String, cmpFn: (String, String) => Int)Int

def curriedCompare(cmpFn:(String,String) => Int)(s1:String,s2:String): Int = {
  cmpFn(s1,s2)
}                                                 //> curriedCompare: (cmpFn: (String, String) => Int)(s1: String, s2: String)Int
                                                  //| 

val defaultCompare = smartCompare(_:String,_:String,compareStrings)
                                                  //> defaultCompare  : (String, String) => Int = <function2>

val x = curriedCompare(_:(String,String)=>Int)("abc","xyz")
                                                  //> x  : ((String, String) => Int) => Int = <function1>
x(compareStrings)                                 //> res0: Int = 1

val y = curriedCompare(compareStrings)(_:String,_:String)
                                                  //> y  : (String, String) => Int = <function2>
y("abc","xyz")                                    //> res1: Int = 1
}