/*
			---------------------NOTES-----------------

A function/Methods with or without paranthesis. Functions defined with Paranthesis
can be called as like fields or they can be invoked like a function.
However Functions defined without fields can ONLY be invoked like a field. If you
try to invoke such function (function defined without paranthesis)
like a regular function call compiler will give error.


*/
object MethodsContinued {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def methodWithParanthesis () = "Hello methodWithParanthesis"
                                                  //> methodWithParanthesis: ()String
  
 println("Called with paranthesis " + methodWithParanthesis())
                                                  //> Called with paranthesis Hello methodWithParanthesis
 println("Called with out paranthesis " + methodWithParanthesis)
                                                  //> Called with out paranthesis Hello methodWithParanthesis
                                                  
def methodWithOutParanthesis = "Hello methodWithOutParanthesis"
                                                  //> methodWithOutParanthesis: => String

 // this will give error
 // println("Called with paranthesis " + methodWithOutParanthesis())
 
 println("methodWithOutParanthesis can ONLY be called without paranthesis " + methodWithOutParanthesis)
                                                  //> methodWithOutParanthesis can ONLY be called without paranthesis Hello method
                                                  //| WithOutParanthesis
}