import java.util.Calendar

/**
CLosures works with both Functins and Methods.

CLosure is nested functions + variables local to outer scope.
*/
object ExampleClosure {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  //Simple High order function
  def geeting (lang :String ) =
  {
  	lang match {
   		case "Hindi" => (x:String) => println ("Namaste" + x)
   		case "English" => (x:String) => println ("Hello" + x)
   		case "French" => (x:String) => println ("Bonjour" + x)
   		case "Spanish" => (x:String) => println ("Hola" + x)
   		
  	}
  }                                               //> geeting: (lang: String)String => Unit
  
  
  
  geeting("Hindi") (" Vijay")                     //> Namaste Vijay
  
  geeting("English") (" Vijay S ")                //> Hello Vijay S 
  
  geeting("French") (" Vijay Srivastava ")        //> Bonjour Vijay Srivastava 
  
  geeting("Spanish") (" VS")                      //> Hola VS
  
  
  //CLosure version of the same methid. The variable 'now' exists even if the
  // outer function/method has finished.
  
  def geetingClosure (lang :String ) =
  {
  	val now = Calendar.getInstance.getTime.toString()
  	
  	lang match {
   		case "Hindi" => (x:String) => println ("Namaste" + x + s" It is $now" )
   		case "English" => (x:String) => println (s"Hello $x, It is $now" )
   		case "French" => (x:String) => println (s"Bonjour $x, It is $now" )
   		case "Spanish" => (x:String) => println (s"Hola $x, It is $now" )
   		
  	}
  }                                               //> geetingClosure: (lang: String)String => Unit
  
    geetingClosure("Hindi") (" Vijay")            //> Namaste Vijay It is Tue Apr 11 06:17:26 EDT 2017
    
    
    geetingClosure("English") (" Vijay S ")       //> Hello  Vijay S , It is Tue Apr 11 06:17:26 EDT 2017
  
  geetingClosure("French") (" Vijay Srivastava ") //> Bonjour  Vijay Srivastava , It is Tue Apr 11 06:17:26 EDT 2017
  
  geetingClosure("Spanish") (" VS")               //> Hola  VS, It is Tue Apr 11 06:17:26 EDT 2017
}