package patternmatching

/**
 * Scala has a standard type named Option for optional values. Such a value can be of two forms.
 * It can be of the form Some(x) where x is the actual value. Or it can be the None object, which represents a missing value. 
 * Optional values are produced by some of the standard operations on Scala’s collections. 
 * For instance, the get method of Scala’s Map produces Some(value) if a value corresponding to a given key has been found, 
 * or None if the given key is not deﬁned in the Map. Here’s an example:
 * 
 */
object OptionTypeTest extends App {

   val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo") 
   
   println (capitals)
   
   println (capitals get "France")
   
   println (capitals get "Somethin Else ")
   
  def show (x : Option [String]) = x match {
     
     case Some (s) => println ("Found " +s)
     
     case None  => println ("Not found ? ")
   }
   
   show ( capitals get "Japan")
   
   show ( capitals get "London")
}