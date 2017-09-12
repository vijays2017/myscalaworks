
object IteratorAndSources  extends App {
  println("Welcome to the Scala worksheet")
  
  
  var line = ""
   do {
   		 line = readLine()
    	println("Read: "+ line)
    } while (line != "")
 
 
 var line1 = ""
 while ((line1 = readLine()) != "") // This doesn’t work! println("Read: "+ line)
    println("Read: "+ line)
    
}