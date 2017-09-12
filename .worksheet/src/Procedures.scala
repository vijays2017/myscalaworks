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

object Procedures {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(603); 
  println("Welcome to the Scala worksheet");$skip(57); 
  
  def thisProc : Unit = {println ("Hello Procedure")};System.out.println("""thisProc: => Unit""");$skip(14); 
  
  thisProc;$skip(97); 
  
  def thisProcWithNoReturn = println ("Hello Procedure without return type. Not recommended");System.out.println("""thisProcWithNoReturn: => Unit""");$skip(23); 
  thisProcWithNoReturn;$skip(110); 
  
  
  def compareStrings(s1:String,s2:String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {1}
};System.out.println("""compareStrings: (s1: String, s2: String)Int""");$skip(96); 


def smartCompare(s1:String, s2:String, cmpFn:(String,String) => Int):Int = {
  cmpFn(s1,s2)
};System.out.println("""smartCompare: (s1: String, s2: String, cmpFn: (String, String) => Int)Int""");$skip(97); 

def curriedCompare(cmpFn:(String,String) => Int)(s1:String,s2:String): Int = {
  cmpFn(s1,s2)
};System.out.println("""curriedCompare: (cmpFn: (String, String) => Int)(s1: String, s2: String)Int""");$skip(69); 

val defaultCompare = smartCompare(_:String,_:String,compareStrings);System.out.println("""defaultCompare  : (String, String) => Int = """ + $show(defaultCompare ));$skip(61); 

val x = curriedCompare(_:(String,String)=>Int)("abc","xyz");System.out.println("""x  : ((String, String) => Int) => Int = """ + $show(x ));$skip(18); val res$0 = 
x(compareStrings);System.out.println("""res0: Int = """ + $show(res$0));$skip(59); 

val y = curriedCompare(compareStrings)(_:String,_:String);System.out.println("""y  : (String, String) => Int = """ + $show(y ));$skip(15); val res$1 = 
y("abc","xyz");System.out.println("""res1: Int = """ + $show(res$1))}
}
