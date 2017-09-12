/*
			---------------------NOTES-----------------

A function/Methods with or without paranthesis. Functions defined with Paranthesis
can be called as like fields or they can be invoked like a function.
However Functions defined without fields can ONLY be invoked like a field. If you
try to invoke such function (function defined without paranthesis)
like a regular function call compiler will give error.


*/
object MethodsContinued {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(481); 
  println("Welcome to the Scala worksheet");$skip(69); 
  
  
  def methodWithParanthesis () = "Hello methodWithParanthesis";System.out.println("""methodWithParanthesis: ()String""");$skip(66); 
  
 println("Called with paranthesis " + methodWithParanthesis());$skip(65); 
 println("Called with out paranthesis " + methodWithParanthesis);$skip(115); 
                                                  
def methodWithOutParanthesis = "Hello methodWithOutParanthesis";System.out.println("""methodWithOutParanthesis: => String""");$skip(201); 

 // this will give error
 // println("Called with paranthesis " + methodWithOutParanthesis())
 
 println("methodWithOutParanthesis can ONLY be called without paranthesis " + methodWithOutParanthesis)}
}
