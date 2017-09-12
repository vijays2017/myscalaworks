import java.util.Calendar

/**
CLosures works with both Functins and Methods.

CLosure is nested functions + variables local to outer scope.
*/
object ExampleClosure {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(211); 
  println("Welcome to the Scala worksheet");$skip(340); 
  
  
  //Simple High order function
  def geeting (lang :String ) =
  {
  	lang match {
   		case "Hindi" => (x:String) => println ("Namaste" + x)
   		case "English" => (x:String) => println ("Hello" + x)
   		case "French" => (x:String) => println ("Bonjour" + x)
   		case "Spanish" => (x:String) => println ("Hola" + x)
   		
  	}
  };System.out.println("""geeting: (lang: String)String => Unit""");$skip(39); 
  
  
  
  geeting("Hindi") (" Vijay");$skip(38); 
  
  geeting("English") (" Vijay S ");$skip(46); 
  
  geeting("French") (" Vijay Srivastava ");$skip(32); 
  
  geeting("Spanish") (" VS");$skip(552); 
  
  
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
  };System.out.println("""geetingClosure: (lang: String)String => Unit""");$skip(42); 
  
    geetingClosure("Hindi") (" Vijay");$skip(54); 
    
    
    geetingClosure("English") (" Vijay S ");$skip(53); 
  
  geetingClosure("French") (" Vijay Srivastava ");$skip(39); 
  
  geetingClosure("Spanish") (" VS")}
}
